package com.tb.manager;

import com.tb.domain.e10.dto.PurchaseArrivalDto;
import com.tb.domain.e10.request.PurchaseArrivalManagerRequest;

public interface PurchaseArrivalManager {

    PurchaseArrivalDto getPurchaseArrivalListByCondition(PurchaseArrivalManagerRequest request);
}
