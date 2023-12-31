package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.PurchaseArrivalDto;
import com.tb.domain.e10.request.PurchaseArrivalManagerRequest;
import com.tb.manager.PurchaseArrivalManager;
import com.tb.mbg.mapper.PurchaseArrivalMapper;
import com.tb.mbg.model.PurchaseArrival;
import com.tb.mbg.model.PurchaseArrivalExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class PurchaseArrivalManagerImpl implements PurchaseArrivalManager {

    @Autowired
    private PurchaseArrivalMapper purchaseArrivalMapper;

    @Override
    public PurchaseArrivalDto getPurchaseArrivalListByCondition(PurchaseArrivalManagerRequest request) {
        PurchaseArrivalExample example = new PurchaseArrivalExample();
        PurchaseArrivalExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getId())){
            criteria.andPurchaseArrivalIdEqualTo(request.getId());
        }
        List<PurchaseArrival> purchaseArrivals = purchaseArrivalMapper.selectByExample(example);
        PurchaseArrivalDto dto = new PurchaseArrivalDto();
        dto.setPurchaseArrivalList(purchaseArrivals);
        return dto;
    }
}
