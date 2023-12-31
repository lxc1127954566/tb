package com.tb.service;

import com.tb.domain.e10.request.CustomerRequest;
import com.tb.domain.xbb.request.XBBCustomRequest;

/**
 * 客户业务接口
 * */
public interface CustomerService {

    String e10ValidateCode(String code);

    String e10Save(CustomerRequest request);

    String xbbSave(XBBCustomRequest request);

}
