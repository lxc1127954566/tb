package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.BpPropertyDDto;
import com.tb.domain.e10.request.BpPropertyDMangerRequest;
import com.tb.manager.BpPropertyDManager;
import com.tb.mbg.mapper.BpPropertyDMapper;
import com.tb.mbg.model.BpPropertyD;
import com.tb.mbg.model.BpPropertyDExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class BpPropertyDMangerImpl implements BpPropertyDManager {

    @Autowired
    private BpPropertyDMapper bpPropertyDMapper;

    @Override
    public BpPropertyDDto getBpPropertyDByCondition(BpPropertyDMangerRequest request) {
        BpPropertyDExample example = new BpPropertyDExample();
        if (!StringUtils.isEmpty(request.getBpPropertyId())){
            example.createCriteria().andBpPropertyIdEqualTo(request.getBpPropertyId());
        }
        if (!StringUtils.isEmpty(request.getPropertyValue())){
            example.createCriteria().andPropertyValueEqualTo(request.getPropertyValue());
        }
        if (!StringUtils.isEmpty(request.getPropertyValueDesc())){
            example.createCriteria().andPropertyValueDescEqualTo(request.getPropertyValueDesc());
        }
        List<BpPropertyD> bpPropertyDS = bpPropertyDMapper.selectByExample(example);
        BpPropertyDDto dto = new BpPropertyDDto();
        dto.setBpPropertyDList(bpPropertyDS);
        return dto;
    }
}
