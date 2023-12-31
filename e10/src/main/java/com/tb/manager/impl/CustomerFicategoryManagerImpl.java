package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CustomerFicategoryDto;
import com.tb.domain.e10.request.CustomerFicategoryManagerRequest;
import com.tb.manager.CustomerFicategoryManager;
import com.tb.mbg.mapper.CustomerFicategoryMapper;
import com.tb.mbg.model.CustomerFicategory;
import com.tb.mbg.model.CustomerFicategoryExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class CustomerFicategoryManagerImpl implements CustomerFicategoryManager {

    @Autowired
    private CustomerFicategoryMapper mapper;

    @Override
    public CustomerFicategoryDto getCustomerFicategoryByCondition(CustomerFicategoryManagerRequest request) {
        CustomerFicategoryExample example = new CustomerFicategoryExample();
        CustomerFicategoryExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCustomerFicategoryName())){
            criteria.andCustomerFicategoryNameEqualTo(request.getCustomerFicategoryName());
        }
        if (!StringUtils.isEmpty(request.getCompanyId())){
            criteria.andOwnerOrgRoidEqualTo(request.getCompanyId());
        }
        if (!StringUtils.isEmpty(request.getCustomerFicategoryCode())){
            criteria.andCustomerFicategoryCodeEqualTo(request.getCustomerFicategoryCode());
        }
        if (!StringUtils.isEmpty(request.getCustomerFicategoryId())){
            criteria.andCustomerFicategoryIdEqualTo(request.getCustomerFicategoryId());
        }
        List<CustomerFicategory> customerFicategories = mapper.selectByExample(example);
        CustomerFicategoryDto dto = new CustomerFicategoryDto();
        dto.setCustomerFicategoryList(customerFicategories);
        return dto;
    }
}
