package com.tb.manager;

import com.tb.domain.e10.dto.CustomerAddresssDto;
import com.tb.domain.e10.request.CustomerAddressManagerRequest;

public interface CustomerAddressManager {

    CustomerAddresssDto getCustomerAddressListByCondition(CustomerAddressManagerRequest request);
}
