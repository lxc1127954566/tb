package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CurrencyDto;
import com.tb.domain.e10.request.CurrencyManagerRequest;
import com.tb.manager.CurrencyManager;
import com.tb.mbg.mapper.CurrencyMapper;
import com.tb.mbg.model.Currency;
import com.tb.mbg.model.CurrencyExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class CurrencyManagerImpl implements CurrencyManager {

    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public CurrencyDto getCurrencyListByCondition(CurrencyManagerRequest request) {
        CurrencyExample example = new CurrencyExample();
        CurrencyExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCurrencyCode())){
            criteria.andCurrencyCodeLike(request.getCurrencyCode());
        }
        if (!StringUtils.isEmpty(request.getCurrencyName())){
            criteria.andCurrencyCodeLike(request.getCurrencyName());
        }
        if (!StringUtils.isEmpty(request.getUnit())) {
            criteria.andUnitLike(request.getUnit());
        }
        List<Currency> currencyList = currencyMapper.selectByExample(example);
        CurrencyDto dto = new CurrencyDto();
        dto.setCurrencyList(currencyList);
        return dto;
    }
}
