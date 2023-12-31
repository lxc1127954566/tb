package com.tb.interfaceManager.xbb.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tb.annotation.Manager;
import com.tb.common.component.XBBConfigConstant;
import com.tb.common.enu.ApiEnum;
import com.tb.common.exception.TBConcreteException;
import com.tb.domain.xbb.request.CustomManagerRequest;
import com.tb.domain.xbb.request.CustomRequest;
import com.tb.interfaceManager.xbb.CustomManager;

import java.util.*;

@Manager
public class CustomManagerImpl implements CustomManager {

    @Override
    public JSONObject save(CustomManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpId()) ? XBBConfigConstant.CORP_ID : request.getCorpId());
        data.put("userId", StringUtils.isEmpty(request.getCorpId()) ? null : request.getUserId());
        data.put("formId", request.getFormId());
        data.put("dataList", request.getRequest());
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_CUSTOM_SAVE_API.getApi(), data);
        JSONObject responseJson;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            return result;
        } else {
            System.out.println(request.getRequest().toString());
            if (StringUtils.equals(responseJson.getString("msg"), "电话存在重复值")){
                CustomRequest customRequest = (CustomRequest) request.getRequest();
                customRequest.setSubForm_1(new ArrayList<>());
                request.setRequest(customRequest);
                return save(request);
            } else {
                throw new TBConcreteException("客户新增失败！" + responseJson.getString("msg"));
            }
        }
    }

    @Override
    public JSONObject getCustomListByCondition(CustomManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpId()) ? XBBConfigConstant.CORP_ID : request.getCorpId());
        data.put("userId", StringUtils.isEmpty(request.getCorpId()) ? null : request.getUserId());
        data.put("formId", request.getFormId());
        data.put("conditions", request.getCondition());
        data.put("page", request.getPage());
        data.put("pageSize", request.getPageSize());
        data.put("isPublic", request.getIsPublic());
        data.put("del", request.getDel());
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_CUSTOM_LIST_API.getApi(), data);
        JSONObject responseJson;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            return result;
        } else {
            throw new TBConcreteException("客户列表获取失败！" + responseJson.getString("msg"));
        }
    }


}
