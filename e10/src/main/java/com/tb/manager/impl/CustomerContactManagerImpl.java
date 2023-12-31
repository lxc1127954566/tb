package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CustomerContactDto;
import com.tb.domain.e10.request.CustomerContactManagerRequest;
import com.tb.manager.CustomerContactManager;
import com.tb.mbg.mapper.CustomerContactMapper;
import com.tb.mbg.model.CustomerContact;
import com.tb.mbg.model.CustomerContactExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class CustomerContactManagerImpl implements CustomerContactManager {

    @Autowired
    private CustomerContactMapper mapper;

    @Override
    public CustomerContactDto getCustomerContactListByCondition(CustomerContactManagerRequest request) {
        CustomerContactExample example = new CustomerContactExample();
        CustomerContactExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCustomerId())){
            criteria.andCustomerBusinessIdEqualTo(request.getCustomerId());
        }
        List<CustomerContact> customerContacts = mapper.selectByExample(example);
        CustomerContactDto dto = new CustomerContactDto();
        dto.setCustomerContactList(customerContacts);
        return dto;
    }
}
