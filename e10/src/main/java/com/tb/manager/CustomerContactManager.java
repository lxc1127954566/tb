package com.tb.manager;

import com.tb.domain.e10.dto.CustomerContactDto;
import com.tb.domain.e10.request.CustomerContactManagerRequest;

public interface CustomerContactManager {

    CustomerContactDto getCustomerContactListByCondition(CustomerContactManagerRequest request);
}
