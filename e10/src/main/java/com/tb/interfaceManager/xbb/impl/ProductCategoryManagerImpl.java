package com.tb.interfaceManager.xbb.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tb.annotation.Manager;
import com.tb.common.component.XBBConfigConstant;
import com.tb.common.enu.ApiEnum;
import com.tb.common.exception.TBConcreteException;
import com.tb.domain.xbb.request.ProductCategoryManagerRequest;
import com.tb.interfaceManager.xbb.ProductCategoryManager;

import java.util.ArrayList;
import java.util.List;

/**
 * 销帮帮产品分类接口业务类
 *
 * @author linxc
 * @date 2023/12/22
 * */
@Manager
public class ProductCategoryManagerImpl implements ProductCategoryManager {

    @Override
    public JSONObject save(ProductCategoryManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpId()) ? XBBConfigConstant.CORP_ID : request.getCorpId());
        data.put("userId", StringUtils.isEmpty(request.getCorpId()) ? null : request.getUserId());
        data.put("name", CollectionUtil.getFirst(request.getNameList()));
        data.put("parentId", request.getParentId());
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_PRODUCTSORT_SAVE_API.getApi(), data);
        JSONObject responseJson;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            return result;
        } else {
            throw new TBConcreteException(CollectionUtil.getFirst(request.getNameList()) + " 插入失败！" + responseJson.getString("msg"));
        }
    }

    @Override
    public JSONObject batchSave(ProductCategoryManagerRequest listRequest) {
        List<Integer> dataIdList = new ArrayList<>();
        for (String name : listRequest.getNameList()){
            List list = new ArrayList();
            list.add(name);
            listRequest.setNameList(list);
            dataIdList.add((Integer) this.save(listRequest).get("dataId"));
        }
        JSONObject result = new JSONObject();
        result.put("successList", dataIdList);
        return result;
    }

    @Override
    public JSONObject delete(ProductCategoryManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpId()) ? XBBConfigConstant.CORP_ID : request.getCorpId());
        data.put("userId", StringUtils.isEmpty(request.getCorpId()) ? null : request.getUserId());
        data.put("dataId", CollectionUtil.getFirst(request.getDataIdList()));
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_PRODUCTSORT_DEL_API.getApi(), data);
        JSONObject responseJson;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            return result;
        } else {
            throw new TBConcreteException(CollectionUtil.getFirst(request.getDataIdList()) + " 删除失败！" + responseJson.getString("msg"));
        }
    }

    public JSONObject batchDelete(ProductCategoryManagerRequest request){
        List<Integer> dataIdList = new ArrayList<>();
        for (int dataId : request.getDataIdList()){
            List list = new ArrayList();
            list.add(dataId);
            request.setDataIdList(list);
            this.delete(request);
            dataIdList.add((dataId));
        }
        JSONObject result = new JSONObject();
        result.put("successList", dataIdList);
        return result;
    }

    @Override
    public JSONArray getList(ProductCategoryManagerRequest request) {
        JSONObject data = new JSONObject();
        data.put("corpid", StringUtils.isEmpty(request.getCorpId()) ? XBBConfigConstant.CORP_ID : request.getCorpId());
        data.put("userId", StringUtils.isEmpty(request.getCorpId()) ? null : request.getUserId());
        String response = XBBConfigConstant.xbbApi(ApiEnum.XBB_PRODUCTSORT_LIST_API.getApi(), data);
        JSONObject responseJson;
        JSONArray list = null;
        responseJson = JSON.parseObject(response);
        if (responseJson.containsKey("code") && responseJson.getInteger("code").equals(1)){
            JSONObject result = responseJson.getJSONObject("result");
            if (ObjectUtil.isNotEmpty(result)){
                list = result.getJSONArray("list");
            }
            return list;
        } else {
            throw new TBConcreteException("获取列表失败！" + responseJson.getString("msg"));
        }
    }
}
