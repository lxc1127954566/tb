package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.PurchaseArrivalDDto;
import com.tb.domain.e10.request.PurchaseArrivalDManagerRequest;
import com.tb.manager.PurchaseArrivalDManager;
import com.tb.mbg.mapper.PurchaseArrivalDMapper;
import com.tb.mbg.model.PurchaseArrivalD;
import com.tb.mbg.model.PurchaseArrivalDExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class PurchaseArrivalDManagerImpl implements PurchaseArrivalDManager {

    @Autowired
    private PurchaseArrivalDMapper mapper;
    @Override
    public PurchaseArrivalDDto getPurchaseArrivalDListByCondition(PurchaseArrivalDManagerRequest request) {
        PurchaseArrivalDExample example = new PurchaseArrivalDExample();
        PurchaseArrivalDExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getId())){
            criteria.andPurchaseArrivalDIdEqualTo(request.getId());
        }
        List<PurchaseArrivalD> purchaseArrivalDS = mapper.selectByExample(example);
        PurchaseArrivalDDto dto = new PurchaseArrivalDDto();
        dto.setPurchaseArrivalDList(purchaseArrivalDS);
        return dto;
    }
}
