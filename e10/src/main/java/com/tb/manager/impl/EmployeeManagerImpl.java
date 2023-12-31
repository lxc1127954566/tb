package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.EmployeeDto;
import com.tb.domain.e10.request.EmployeeManagerRequest;
import com.tb.manager.EmployeeManager;
import com.tb.mbg.mapper.EmployeeMapper;
import com.tb.mbg.model.Employee;
import com.tb.mbg.model.EmployeeExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    private EmployeeMapper mapper;

    @Override
    public EmployeeDto getEmployeeListByCondition(EmployeeManagerRequest request) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getEmployeeId())){
            criteria.andEmployeeIdEqualTo(request.getEmployeeId());
        }
        if (!StringUtils.isEmpty(request.getEmployeeCode())){
            criteria.andEmployeeCodeEqualTo(request.getEmployeeCode());
        }
        if (!StringUtils.isEmpty(request.getEmployeeName())){
            criteria.andEmailNameEqualTo(request.getEmployeeName());
        }
        List<Employee> employees = mapper.selectByExample(example);
        EmployeeDto dto = new EmployeeDto();
        dto.setEmployeeList(employees);
        return dto;
    }
}
