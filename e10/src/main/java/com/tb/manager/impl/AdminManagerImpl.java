package com.tb.manager.impl;

import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.AdminUnitDto;
import com.tb.manager.AdminManager;
import com.tb.mbg.mapper.AdminUnitMapper;
import com.tb.mbg.model.AdminUnit;
import com.tb.mbg.model.AdminUnitExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Manager
public class AdminManagerImpl implements AdminManager {

    @Autowired
    private AdminUnitMapper adminUnitMapper;

    @Override
    public AdminUnitDto getAdminUnitListByAdminName(String name) {
        AdminUnitExample example = new AdminUnitExample();
        AdminUnitExample.Criteria criteria = example.createCriteria();
        criteria.andAdminUnitNameLike(name);
        List<AdminUnit> adminUnits = adminUnitMapper.selectByExample(example);
        AdminUnitDto dto = new AdminUnitDto();
        dto.setAdminUnitList(adminUnits);
        return dto;
    }

    @Override
    public AdminUnitDto getAdminUnitListById(String id) {
        AdminUnit adminUnit = adminUnitMapper.selectByPrimaryKey(id);
        List<AdminUnit> list = new ArrayList<>();
        list.add(adminUnit);
        AdminUnitDto dto = new AdminUnitDto();
        dto.setAdminUnitList(list);
        return dto;
    }
}
