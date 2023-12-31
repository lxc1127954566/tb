package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CustomerSalesDto;
import com.tb.domain.e10.request.CustomerSalesManagerRequest;
import com.tb.manager.CustomerSalesManager;
import com.tb.mbg.mapper.CustomerSalesMapper;
import com.tb.mbg.model.CustomerSales;
import com.tb.mbg.model.CustomerSalesExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Manager
public class CustomerSalesManagerImpl implements CustomerSalesManager {

    @Autowired
    private CustomerSalesMapper mapper;

    @Override
    public int save(CustomerSalesManagerRequest request) {
        CustomerSales customerSales = new CustomerSales();
        customerSales.setOwnerDept(!StringUtils.isEmpty(request.getDeptId()) ? request.getDeptId() : null);
        customerSales.setOwnerEmp(!StringUtils.isEmpty(request.getUserId()) ? request.getUserId() : null);
        customerSales.setCurrencyId(request.getCurrencyId());
        customerSales.setCsTaxClassificationId(request.getTaxSortId());
        customerSales.setCustomerId(request.getCustomerId());
        customerSales.setCustomerBusinessId(request.getCustomerSalesId());
        customerSales.setOwnerOrgRtk("SALES_CENTER");
        customerSales.setOwnerOrgRoid(request.getSalesAreaId());
        customerSales.setCreatedate(new Date());
        customerSales.setCreateby(request.getUserId());
        customerSales.setLastmodifieddate(new Date());
        customerSales.setLastmodifiedby(request.getUserId());
        customerSales.setModifieddate(new Date());
        customerSales.setModifiedby(request.getUserId());
        customerSales.setApproveby(request.getUserId());
        customerSales.setApprovedate(new Date());
        customerSales.setApprovestatus("Y");
        int i = mapper.insertSelective(customerSales);
        return i;
    }

    @Override
    public CustomerSalesDto getCustomerSalesListByCondition(CustomerSalesManagerRequest request) {
        CustomerSalesExample example = new CustomerSalesExample();
        CustomerSalesExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCustomerId())){
            criteria.andCustomerIdEqualTo(request.getCustomerId());
        }
        if (!StringUtils.isEmpty(request.getCustomerSalesId())){
            criteria.andCustomerBusinessIdEqualTo(request.getCustomerSalesId());
        }
        if (!StringUtils.isEmpty(request.getSalesAreaId())){
            criteria.andOwnerOrgRoidEqualTo(request.getSalesAreaId());
        }
        List<CustomerSales> customerSales = mapper.selectByExample(example);
        CustomerSalesDto dto = new CustomerSalesDto();
        dto.setCustomerSalesList(customerSales);
        return dto;
    }
}
