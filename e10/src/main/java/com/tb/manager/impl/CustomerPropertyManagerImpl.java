package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CustomerPropertyDto;
import com.tb.domain.e10.request.CustomerPropertyRequest;
import com.tb.manager.CustomerPropertyManager;
import com.tb.mbg.mapper.CustomerPropertyMapper;
import com.tb.mbg.model.CustomerProperty;
import com.tb.mbg.model.CustomerPropertyExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Manager
public class CustomerPropertyManagerImpl implements CustomerPropertyManager {

    @Autowired
    private CustomerPropertyMapper customerPropertyMapper;

    @Override
    public int save(CustomerPropertyRequest request) {
        CustomerProperty customerProperty = new CustomerProperty();
        customerProperty.setCustomerPropertyId(request.getCustomerPropertyId());
        customerProperty.setCustomerBusinessId(request.getCustomerId());
        customerProperty.setBpPropertyId(request.getBpPropertyId());
        customerProperty.setPropertyValueId(request.getPropertyValueId());
        customerProperty.setParentCustomerId(request.getCustomerId());
        customerProperty.setPropertyValue(request.getPropertyValue());
        customerProperty.setPropertyValueDesc(request.getPropertyValueDesc());
        customerProperty.setOrgIdRtk("PARA_GROUP");
        customerProperty.setRemark(request.getRemark());
        customerProperty.setCreateby(request.getSubmitId());
        customerProperty.setCreatedate(new Date());
        customerProperty.setLastmodifiedby(request.getSubmitId());
        customerProperty.setLastmodifieddate(new Date());
        customerProperty.setModifieddate(new Date());
        customerProperty.setModifiedby(request.getSubmitId());
        customerProperty.setApproveby(request.getSubmitId());
        customerProperty.setApprovedate(new Date());
        customerProperty.setApprovestatus("N");
        int i = customerPropertyMapper.insertSelective(customerProperty);
        return i;
    }

    @Override
    public CustomerPropertyDto getCustomerPropertyListByCondition(CustomerPropertyRequest request) {
        CustomerPropertyExample example = new CustomerPropertyExample();
        CustomerPropertyExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCustomerId())){
            criteria.andCustomerBusinessIdEqualTo(request.getCustomerId());
        }
        if (!StringUtils.isEmpty(request.getBpPropertyId())){
            criteria.andBpPropertyIdEqualTo(request.getBpPropertyId());
        }
        List<CustomerProperty> customerProperties = customerPropertyMapper.selectByExample(example);
        CustomerPropertyDto dto = new CustomerPropertyDto();
        dto.setCustomerPropertyList(customerProperties);
        return dto;
    }


}
