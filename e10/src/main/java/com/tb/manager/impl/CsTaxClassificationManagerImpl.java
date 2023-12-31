package com.tb.manager.impl;

import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CsTaxClassificationDto;
import com.tb.domain.e10.request.CsTaxClassificationManagerRequest;
import com.tb.manager.CsTaxClassificationManager;
import com.tb.mbg.mapper.CsTaxClassificationMapper;
import com.tb.mbg.model.CsTaxClassification;
import com.tb.mbg.model.CsTaxClassificationExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class CsTaxClassificationManagerImpl implements CsTaxClassificationManager {

    @Autowired
    private CsTaxClassificationMapper csTaxClassificationMapper;

    @Override
    public CsTaxClassificationDto getCsTaxClassificationByCondition(CsTaxClassificationManagerRequest request) {
        CsTaxClassificationExample example = new CsTaxClassificationExample();
        CsTaxClassificationExample.Criteria criteria = example.createCriteria();
        criteria.andCsTaxClassificationCodeEqualTo(request.getTaxClassificationCode());
        List<CsTaxClassification> csTaxClassifications = csTaxClassificationMapper.selectByExample(example);
        CsTaxClassificationDto dto = new CsTaxClassificationDto();
        dto.setCsTaxClassificationList(csTaxClassifications);
        return dto;
    }
}
