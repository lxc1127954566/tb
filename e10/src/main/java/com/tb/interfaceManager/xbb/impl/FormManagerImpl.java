package com.tb.interfaceManager.xbb.impl;

import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tb.annotation.Manager;
import com.tb.common.component.XBBConfigConstant;
import com.tb.common.enu.ApiEnum;
import com.tb.common.exception.TBConcreteException;
import com.tb.domain.xbb.request.FormManagerRequest;
import com.tb.domain.xbb.request.ProductRequest;
import com.tb.interfaceManager.xbb.FormManager;

@Manager
public class FormManagerImpl implements FormManager {

    @Override
    public JSONObject getFormManager(FormManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpid()) ? XBBConfigConstant.CORP_ID : request.getCorpid());
        data.put("userId", StringUtils.isEmpty(request.getUserId()) ? null : request.getUserId());
        data.put("name", StringUtils.isEmpty(request.getName()) ? null : request.getName());
        data.put("saasMark", ObjectUtil.isEmpty(request.getSaasMark()) ? null : request.getSaasMark());
        data.put("businessType", ObjectUtil.isEmpty(request.getBusinessType()) ? null : request.getBusinessType());
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_FORM_LIST_API.getApi(), data);
        JSONObject responseJson;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            return result;
        } else {
            throw new TBConcreteException("获取表单失败" + responseJson.getString("msg"));
        }
    }
}
