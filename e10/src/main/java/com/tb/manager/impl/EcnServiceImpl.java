package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.domain.e10.dto.EcnDto;
import com.tb.manager.EcnService;
import com.tb.mbg.mapper.EcnDMapper;
import com.tb.mbg.mapper.EcnMapper;
import com.tb.mbg.model.Ecn;
import com.tb.mbg.model.EcnD;
import com.tb.mbg.model.EcnDExample;
import com.tb.mbg.model.EcnExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class EcnServiceImpl implements EcnService {

    @Autowired
    private EcnMapper ecnMapper;

    @Autowired
    private EcnDMapper ecnDMapper;

    @Override
    public List<Ecn> getAuditedECNWithinLastModifiedTime(EcnDto ecnDto) throws ClassNotFoundException {
        if (ObjectUtils.isEmpty(ecnDto)){
            throw new ClassNotFoundException("未获取到EchDto类");
        }
        EcnExample ecnExample = new EcnExample();
        EcnExample.Criteria criteria = ecnExample.createCriteria();
        ecnExample.setOrderByClause("Las");
        criteria.andLastmodifieddateGreaterThanOrEqualTo(ecnDto.getLastmodifieddate());
        criteria.andApprovestatusEqualTo(ecnDto.getApprovestatus());
        criteria.andOwnerOrgRtkEqualTo(ecnDto.getOwnerOrgRtk());
        List<Ecn> ecns = ecnMapper.selectByExample(ecnExample);
        return ecns;
    }

    @Override
    public List<EcnD> getEcnDByEcnID(String ecnId){
        if (StringUtils.isEmpty(ecnId)){
            return new ArrayList<>();
        }
        EcnDExample ecnDExample = new EcnDExample();
        EcnDExample.Criteria criteria = ecnDExample.createCriteria();
        criteria.andEcnIdEqualTo(ecnId);
        List<EcnD> ecnDS = ecnDMapper.selectByExample(ecnDExample);
        return ecnDS;
    }
}
