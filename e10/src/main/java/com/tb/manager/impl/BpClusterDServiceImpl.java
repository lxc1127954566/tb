package com.tb.manager.impl;

import com.tb.domain.e10.dto.BpClusterDDto;
import com.tb.manager.BpClusterDService;
import com.tb.mbg.mapper.BpClusterDMapper;
import com.tb.mbg.model.BpClusterD;
import com.tb.mbg.model.BpClusterDExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BpClusterDServiceImpl implements BpClusterDService {

    @Autowired
    private BpClusterDMapper bpClusterDMapper;

    @Override
    public BpClusterDDto getBpClusterDByBpClusterPrimary(String primaryKey) {
        BpClusterDExample example = new BpClusterDExample();
        BpClusterDExample.Criteria criteria = example.createCriteria();
        criteria.andBpClusterIdEqualTo(primaryKey);
        List<BpClusterD> bpClusterDS = bpClusterDMapper.selectByExample(example);
        BpClusterDDto dto = new BpClusterDDto();
        dto.setBpClusterDList(bpClusterDS);
        return dto;
    }

    @Override
    public BpClusterDDto getBpClusterDById(String id) {
        BpClusterD bpClusterD = bpClusterDMapper.selectByPrimaryKey(id);
        BpClusterDDto dto = new BpClusterDDto();
        List<BpClusterD> list = new ArrayList<>();
        list.add(bpClusterD);
        dto.setBpClusterDList(list);
        return dto;
    }
}
