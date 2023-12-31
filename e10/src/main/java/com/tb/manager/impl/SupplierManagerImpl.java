package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.SupplierDto;
import com.tb.domain.e10.request.SupplierManagerRequest;
import com.tb.manager.SupplierManager;
import com.tb.mbg.mapper.SupplierMapper;
import com.tb.mbg.model.Supplier;
import com.tb.mbg.model.SupplierExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class SupplierManagerImpl implements SupplierManager {

    @Autowired
    private SupplierMapper mapper;

    @Override
    public SupplierDto getSupplierListByCondition(SupplierManagerRequest request) {
        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getId())){
            criteria.andSupplierBusinessIdEqualTo(request.getId());
        }
        if (!StringUtils.isEmpty(request.getCode())){
            criteria.andSupplierCodeEqualTo(request.getCode());
        }
        if (!StringUtils.isEmpty(request.getName())){
            criteria.andSupplierNameEqualTo(request.getName());
        }
        if (!StringUtils.isEmpty(request.getFullName())){
            criteria.andSupplierFullNameEqualTo(request.getFullName());
        }
        List<Supplier> suppliers = mapper.selectByExample(example);
        SupplierDto dto = new SupplierDto();
        dto.setSupplierList(suppliers);
        return dto;
    }
}
