package com.tb.manager.impl;

import com.tb.annotation.Manager;
import com.tb.domain.e10.request.CustomerFiManagerRequest;
import com.tb.manager.CustomerFiManager;
import com.tb.mbg.mapper.CustomerFiMapper;
import com.tb.mbg.model.CustomerFi;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Manager
public class CustomerFiManagerImpl implements CustomerFiManager {

    @Autowired
    private CustomerFiMapper mapper;

    @Override
    public int save(CustomerFiManagerRequest request) {
        CustomerFi customerFi = new CustomerFi();
        customerFi.setCustomerId(request.getCustomerId());
        customerFi.setCustomerFiId(request.getCustomerFiId());
        customerFi.setCurrencyId(request.getCurrencyId());
        customerFi.setCustomerFicategoryId(request.getCustomerFicategoryId());
        customerFi.setOwnerOrgRtk("COMPANY");
        customerFi.setOwnerOrgRoid(request.getCompanyId());
        customerFi.setCreatedate(new Date());
        customerFi.setCreateby(request.getSubmitId());
        customerFi.setLastmodifieddate(new Date());
        customerFi.setLastmodifiedby(request.getSubmitId());
        customerFi.setModifieddate(new Date());
        customerFi.setModifiedby(request.getSubmitId());
        customerFi.setApproveby(request.getSubmitId());
        customerFi.setApprovedate(new Date());
        customerFi.setApprovestatus("Y");
        int i = mapper.insertSelective(customerFi);
        return i;
    }
}
