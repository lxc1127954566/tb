package com.tb.manager.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CustomerDto;
import com.tb.domain.e10.request.CustomerManagerRequest;
import com.tb.manager.CustomerManager;
import com.tb.mbg.mapper.CustomerMapper;
import com.tb.mbg.model.Customer;
import com.tb.mbg.model.CustomerExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Manager
public class CustomerManagerImpl implements CustomerManager {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public CustomerDto getCustomerByCondition(CustomerManagerRequest request) {
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCustomerCode())){
            criteria.andCustomerCodeEqualTo(request.getCustomerCode());
        }
        if (!StringUtils.isEmpty(request.getCustomerFullName())){
            criteria.andCustomerFullNameEqualTo(request.getCustomerFullName());
        }
        if (!StringUtils.isEmpty(request.getCustomerName())){
            criteria.andCustomerNameEqualTo(request.getCustomerName());
        }
        if (!StringUtils.isEmpty(request.getPrincipal())){
            criteria.andPrincipalEqualTo(request.getPrincipal());
        }
        if (ObjectUtil.isNotEmpty(request.getCreateDate())){
            criteria.andCreatedateGreaterThanOrEqualTo(request.getCreateDate());
        }
        if (ObjectUtil.isNotEmpty(request.getLastModifiedDate())){
            criteria.andLastmodifieddateGreaterThanOrEqualTo(request.getLastModifiedDate());
        }
        List<Customer> customers = customerMapper.selectByExample(example);
        CustomerDto dto = new CustomerDto();
        dto.setCustomerList(customers);
        return dto;
    }

    @Override
    public int save(CustomerManagerRequest request){
        Customer customer = new Customer();
        customer.setCustomerBusinessId(request.getCustomerBusinessId());
        customer.setCustomerCode(request.getCustomerCode());
        customer.setCustomerName(request.getCustomerName());
        customer.setCustomerFullName(request.getCustomerFullName());
        customer.setShortcut(request.getShortcut());
        customer.setCapital(request.getCapital());
        customer.setTurnover(request.getTurnover());
        customer.setStaffs(request.getStaffs());
        customer.setSetupDate(request.getSetupDate());
        customer.setShutoutDate(request.getShutoutDate());
        customer.setBranches(request.getBranches());
        customer.setRemark(request.getRemark());
        customer.setPrincipal(request.getPrincipal());
        customer.setRegAddress(request.getRegAddress());
        customer.setInnerCustomer(request.getInnerCustomer());
        customer.setBpClusterId(request.getBpClusterId());
        customer.setGeneralCurrencyId(request.getGeneralCurrencyId());
        customer.setCreatedate(new Date());
        customer.setCreateby(request.getSubmitId());
        customer.setLastmodifieddate(new Date());
        customer.setLastmodifiedby(request.getSubmitId());
        customer.setModifieddate(new Date());
        customer.setModifiedby(request.getSubmitId());
        customer.setApproveby(request.getSubmitId());
        customer.setApprovedate(new Date());
        customer.setApprovestatus("Y");
        int i = customerMapper.insertSelective(customer);
        return i;
    }
}
