package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.UnitManagerDto;
import com.tb.domain.e10.request.UnitManagerRequest;
import com.tb.manager.UnitManager;
import com.tb.mbg.mapper.UnitMapper;
import com.tb.mbg.model.Unit;
import com.tb.mbg.model.UnitExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class UnitManagerImpl implements UnitManager {

    @Autowired
    private UnitMapper mapper;

    @Override
    public UnitManagerDto getUnitListByCondition(UnitManagerRequest request) {
        UnitExample example = new UnitExample();
        UnitExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getUnitId())){
            criteria.andUnitIdEqualTo(request.getUnitId());
        }
        if (!StringUtils.isEmpty(request.getUnitCode())){
            criteria.andUnitCodeEqualTo(request.getUnitCode());
        }
        if (!StringUtils.isEmpty(request.getUnitName())){
            criteria.andUnitNameEqualTo(request.getUnitName());
        }
        List<Unit> units = mapper.selectByExample(example);
        UnitManagerDto dto = new UnitManagerDto();
        dto.setUnitList(units);
        return dto;
    }
}
