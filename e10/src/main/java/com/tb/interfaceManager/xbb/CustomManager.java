package com.tb.interfaceManager.xbb;

import com.alibaba.fastjson.JSONObject;
import com.tb.domain.xbb.request.CustomManagerRequest;

/**
 * 销帮帮客户接口
 * */
public interface CustomManager {

    JSONObject save(CustomManagerRequest request);

    JSONObject getCustomListByCondition(CustomManagerRequest request);
}
