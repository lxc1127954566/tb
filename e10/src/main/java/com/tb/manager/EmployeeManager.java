package com.tb.manager;

import com.tb.domain.e10.dto.EmployeeDto;
import com.tb.domain.e10.request.EmployeeManagerRequest;

public interface EmployeeManager {

    EmployeeDto getEmployeeListByCondition(EmployeeManagerRequest request);
}
