package com.tb.manager;

import com.tb.domain.e10.dto.CustomerDto;
import com.tb.domain.e10.request.CustomerManagerRequest;

/**
 * @author linxc
 * @description 客户表业务接口
 * */
public interface CustomerManager {

    /**
     * 通过客户编号查询客户信息
     * */
    CustomerDto getCustomerByCondition(CustomerManagerRequest request);

    /**
     * 新增客户信息
     * */
    int save(CustomerManagerRequest request);
}
