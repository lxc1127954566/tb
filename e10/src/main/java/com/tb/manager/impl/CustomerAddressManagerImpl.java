package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CustomerAddresssDto;
import com.tb.domain.e10.request.CustomerAddressManagerRequest;
import com.tb.manager.CustomerAddressManager;
import com.tb.mbg.mapper.CustomerAddressMapper;
import com.tb.mbg.model.CustomerAddress;
import com.tb.mbg.model.CustomerAddressExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class CustomerAddressManagerImpl implements CustomerAddressManager {

    @Autowired
    private CustomerAddressMapper mapper;

    @Override
    public CustomerAddresssDto getCustomerAddressListByCondition(CustomerAddressManagerRequest request) {
        CustomerAddressExample example = new CustomerAddressExample();
        CustomerAddressExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCustomerId())){
            criteria.andCustomerBusinessIdEqualTo(request.getCustomerId());
        }
        List<CustomerAddress> customerAddresses = mapper.selectByExample(example);
        CustomerAddresssDto dto = new CustomerAddresssDto();
        dto.setCustomerAddressList(customerAddresses);
        return dto;
    }
}
