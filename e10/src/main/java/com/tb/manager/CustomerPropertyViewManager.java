package com.tb.manager;

import com.tb.domain.e10.request.CustomerPropertyViewManagerRequest;

public interface CustomerPropertyViewManager {

    /**
     * 新增客户属性视图
     * */
    int save(CustomerPropertyViewManagerRequest request);
}
