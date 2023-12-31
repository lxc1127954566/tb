package com.tb.manager.impl;

import com.tb.annotation.Manager;
import com.tb.domain.e10.request.CustomerPropertyViewManagerRequest;
import com.tb.manager.CustomerPropertyViewManager;
import com.tb.mbg.mapper.CustomerPropertyViewMapper;
import com.tb.mbg.model.CustomerPropertyView;
import org.springframework.beans.factory.annotation.Autowired;


@Manager
public class CustomerPropertyViewManagerImpl implements CustomerPropertyViewManager {

    @Autowired
    private CustomerPropertyViewMapper mapper;

    @Override
    public int save(CustomerPropertyViewManagerRequest request) {
        CustomerPropertyView customerPropertyView = new CustomerPropertyView();
        customerPropertyView.setCustomerPropertyViewId(request.getCustomerPropertyViewId());
        customerPropertyView.setCustomerId(request.getCustomerId());
        customerPropertyView.setP5(request.getP5());
        customerPropertyView.setP6(request.getP6());
        customerPropertyView.setP7(request.getP7());
        customerPropertyView.setOrgIdRtk("PARA_GROUP");
        int i = mapper.insertSelective(customerPropertyView);
        return i;
    }
}
