package com.tb.interfaceManager.xbb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tb.domain.xbb.request.ProductCategoryManagerRequest;

/**
 * 销帮帮产品分类
 *
 * @author linxc
 * @date 2023/12/22
 * */
public interface ProductCategoryManager {

    JSONObject save(ProductCategoryManagerRequest request);

    JSONObject batchSave(ProductCategoryManagerRequest listRequest);

    JSONObject delete(ProductCategoryManagerRequest request);

    JSONArray getList(ProductCategoryManagerRequest request);
}
