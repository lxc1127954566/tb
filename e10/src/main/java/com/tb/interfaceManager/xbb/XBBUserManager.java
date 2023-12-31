package com.tb.interfaceManager.xbb;

import com.alibaba.fastjson.JSONObject;
import com.tb.domain.xbb.request.UserManagerRequest;

public interface XBBUserManager {

    /**
     * 通过索引条件获取用户列表
     * */
    JSONObject getUserListByCondition(UserManagerRequest request);
}
