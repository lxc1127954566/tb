package com.tb.manager;

import com.tb.domain.e10.dto.SupplierDto;
import com.tb.domain.e10.request.SupplierManagerRequest;

public interface SupplierManager {

    SupplierDto getSupplierListByCondition(SupplierManagerRequest request);
}
