package com.tb.interfaceManager.xbb;

import com.alibaba.fastjson.JSONObject;
import com.tb.domain.xbb.request.ProductManagerRequest;

/**
 * 销帮帮产品接口
 *
 * @author linxc
 * @date 2023/12/22
 * */
public interface ProductManager {

    JSONObject save(ProductManagerRequest request);

    JSONObject delete();
}
