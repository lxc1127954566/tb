package com.tb.interfaceManager.xbb;

import com.alibaba.fastjson.JSONObject;
import com.tb.domain.xbb.request.FormManagerRequest;

public interface FormManager {

    JSONObject getFormManager(FormManagerRequest request);
}
