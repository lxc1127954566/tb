package com.tb.manager;

import com.tb.domain.e10.dto.SalesCenterDto;
import com.tb.domain.e10.request.SalesCenterManagerRequest;

public interface SalesCenterManager {

    SalesCenterDto getSalesCenterByCondition(SalesCenterManagerRequest request);
}
