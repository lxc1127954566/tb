package com.tb.manager;

import com.tb.domain.e10.dto.CompanyDto;
import com.tb.domain.e10.request.CompanyManagerRequest;

public interface CompanyManager {

    CompanyDto getCompanyByCondition(CompanyManagerRequest request);
}
