package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.CompanyDto;
import com.tb.domain.e10.request.CompanyManagerRequest;
import com.tb.manager.CompanyManager;
import com.tb.mbg.mapper.CompanyMapper;
import com.tb.mbg.model.Company;
import com.tb.mbg.model.CompanyExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class CompanyManagerImp implements CompanyManager {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public CompanyDto getCompanyByCondition(CompanyManagerRequest request) {
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getCompanyCode())){
            criteria.andCompanyCodeEqualTo(request.getCompanyCode());
        }
        if (!StringUtils.isEmpty(request.getCompanyName())){
            criteria.andCompanyNameEqualTo(request.getCompanyName());
        }
        if (!StringUtils.isEmpty(request.getCompanyFullName())){
            criteria.andCompanyFullNameEqualTo(request.getCompanyFullName());
        }
        if (!StringUtils.isEmpty(request.getCompanyId())){
            criteria.andCompanyIdEqualTo(request.getCompanyId());
        }
        List<Company> companies = companyMapper.selectByExample(example);
        CompanyDto dto = new CompanyDto();
        dto.setCompanyList(companies);
        return dto;
    }
}
