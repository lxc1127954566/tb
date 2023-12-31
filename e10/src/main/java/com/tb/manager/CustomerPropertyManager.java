package com.tb.manager;

import com.tb.domain.e10.dto.CustomerPropertyDto;
import com.tb.domain.e10.request.CustomerPropertyRequest;

public interface CustomerPropertyManager {

    /**
     * 新增属性信息
     *
     * @return int
     * */
    int save(CustomerPropertyRequest request);

     /**
      * 获取客户属性信息
      *
      * @Return
      * */
     CustomerPropertyDto getCustomerPropertyListByCondition(CustomerPropertyRequest request);
}
