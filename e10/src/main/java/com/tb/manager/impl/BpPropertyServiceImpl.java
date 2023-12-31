package com.tb.manager.impl;

import com.tb.domain.e10.dto.BpPropertyDto;
import com.tb.manager.BpPropertyService;
import com.tb.mbg.mapper.BpPropertyMapper;
import com.tb.mbg.model.BpProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BpPropertyServiceImpl implements BpPropertyService {

    @Autowired
    private BpPropertyMapper bpPropertyMapper;

    @Override
    public BpPropertyDto getBpPropertyById(String id) {
        BpProperty bpProperty = bpPropertyMapper.selectByPrimaryKey(id);
        List<BpProperty> list = new ArrayList<>();
        list.add(bpProperty);
        BpPropertyDto dto = new BpPropertyDto();
        dto.setBpPropertyList(list);
        return dto;
    }
}
