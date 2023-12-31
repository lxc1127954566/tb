package com.tb.interfaceManager.xbb.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tb.annotation.Manager;
import com.tb.common.component.XBBConfigConstant;
import com.tb.common.enu.ApiEnum;
import com.tb.common.exception.TBConcreteException;
import com.tb.domain.xbb.request.UserManagerRequest;
import com.tb.interfaceManager.xbb.XBBUserManager;

@Manager
public class XBBUserManagerImpl implements XBBUserManager {

    @Override
    public JSONObject getUserListByCondition(UserManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpId()) ? XBBConfigConstant.CORP_ID : request.getCorpId());
        data.put("userId", StringUtils.isEmpty(request.getCorpId()) ? null : request.getUserId());
        if (!StringUtils.isEmpty(request.getUsername())){
            data.put("nameLike", request.getUsername());
        }
        if (CollectionUtil.isNotEmpty(request.getUserIdList())){
            data.put("userIdIn", request.getUserIdList().toArray());
        }
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_USER_LIST_API.getApi(), data);
        JSONObject responseJson;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            return result;
        } else {
            throw new TBConcreteException("用户列表获取异常！" + responseJson.getString("msg"));
        }
    }
}
