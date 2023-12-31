package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.SalesCenterDto;
import com.tb.domain.e10.request.SalesCenterManagerRequest;
import com.tb.manager.SalesCenterManager;
import com.tb.mbg.mapper.SalesCenterMapper;
import com.tb.mbg.model.SalesCenter;
import com.tb.mbg.model.SalesCenterExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class SalesCenterManagerImpl implements SalesCenterManager {

    @Autowired
    private SalesCenterMapper mapper;

    @Override
    public SalesCenterDto getSalesCenterByCondition(SalesCenterManagerRequest request) {
        SalesCenterExample example = new SalesCenterExample();
        SalesCenterExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getSalesCenterCode())){
            criteria.andSalesCenterCodeEqualTo(request.getSalesCenterCode());
        }
        if (!StringUtils.isEmpty(request.getSalesCenterName())){
            criteria.andSalesCenterNameEqualTo(request.getSalesCenterName());
        }
        if (!StringUtils.isEmpty(request.getSalesCenterId())){
            criteria.andSalesCenterIdEqualTo(request.getSalesCenterId());
        }
        List<SalesCenter> salesCenters = mapper.selectByExample(example);
        SalesCenterDto dto = new SalesCenterDto();
        dto.setSalesCenterList(salesCenters);
        return dto;
    }
}
