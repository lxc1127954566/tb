package com.tb.interfaceManager.xbb.impl;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tb.annotation.Manager;
import com.tb.common.component.XBBConfigConstant;
import com.tb.common.enu.ApiEnum;
import com.tb.common.exception.TBConcreteException;
import com.tb.domain.xbb.request.ProductManagerRequest;
import com.tb.domain.xbb.request.ProductRequest;
import com.tb.interfaceManager.xbb.ProductManager;

/**
 * 销帮帮产品接口实现类
 * */
@Manager
public class ProductManagerImpl implements ProductManager {

    @Override
    public JSONObject save(ProductManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpId()) ? XBBConfigConstant.CORP_ID : request.getCorpId());
        data.put("userId", StringUtils.isEmpty(request.getCorpId()) ? null : request.getUserId());
        data.put("dataList", request.getProduct());
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_PRODUCT_SAVE_API.getApi(), data);
        JSONObject responseJson;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            return result;
        } else {
            throw new TBConcreteException(((ProductRequest)request.getProduct()).getName() + " 插入失败！" + responseJson.getString("msg"));
        }
    }

    @Override
    public JSONObject delete() {
        return null;
    }
}
