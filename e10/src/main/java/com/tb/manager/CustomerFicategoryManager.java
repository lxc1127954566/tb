package com.tb.manager;

import com.tb.domain.e10.dto.CustomerFicategoryDto;
import com.tb.domain.e10.request.CustomerFicategoryManagerRequest;

public interface CustomerFicategoryManager {

    CustomerFicategoryDto getCustomerFicategoryByCondition(CustomerFicategoryManagerRequest request);
}
