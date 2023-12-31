package com.tb.manager;

import com.tb.domain.e10.dto.PurchaseArrivalDDto;
import com.tb.domain.e10.request.PurchaseArrivalDManagerRequest;

public interface PurchaseArrivalDManager {

    PurchaseArrivalDDto getPurchaseArrivalDListByCondition(PurchaseArrivalDManagerRequest request);
}
