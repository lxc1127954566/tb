package com.tb.manager.impl;

import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.PoArrivalInspectionDto;
import com.tb.domain.e10.request.PoArrivalInspectionRequest;
import com.tb.manager.PoArrivalInspectionManager;
import com.tb.mbg.mapper.PoArrivalInspectionMapper;
import com.tb.mbg.model.PoArrivalInspection;
import com.tb.mbg.model.PoArrivalInspectionExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class PoArrivalInspectionManagerImpl implements PoArrivalInspectionManager {

    @Autowired
    private PoArrivalInspectionMapper poArrivalInspectionMapper;

    @Override
    public PoArrivalInspectionDto getPoArrivalInspectionListByCondition(PoArrivalInspectionRequest request) {
        PoArrivalInspectionExample example = new PoArrivalInspectionExample();
        PoArrivalInspectionExample.Criteria criteria = example.createCriteria();
        if (ObjectUtil.isNotEmpty(request.getCreateDate())){
            criteria.andCreatedateGreaterThanOrEqualTo(request.getCreateDate());
        }
        if (ObjectUtil.isNotEmpty(request.getLastModifiedDate())){
            criteria.andLastmodifieddateGreaterThanOrEqualTo(request.getLastModifiedDate());
        }
        if (!StringUtils.isEmpty(request.getId())){
            criteria.andPoArrivalInspectionIdEqualTo(request.getId());
        }
        if (!StringUtils.isEmpty(request.getApproveStatus())){
            criteria.andApprovestatusEqualTo(request.getApproveStatus());
        }
        List<PoArrivalInspection> poArrivalInspections = poArrivalInspectionMapper.selectByExample(example);
        PoArrivalInspectionDto dto = new PoArrivalInspectionDto();
        dto.setPoArrivalInspectionList(poArrivalInspections);
        return dto;
    }
}
