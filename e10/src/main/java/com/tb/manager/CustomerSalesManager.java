package com.tb.manager;

import com.tb.domain.e10.dto.CustomerSalesDto;
import com.tb.domain.e10.request.CustomerSalesManagerRequest;

public interface CustomerSalesManager {

    /**
     * 新增客户业务信息
     * */
    int save(CustomerSalesManagerRequest request);

    /**
     * 通过条件获取客户业务信息
     * */
    CustomerSalesDto getCustomerSalesListByCondition(CustomerSalesManagerRequest request);
}
