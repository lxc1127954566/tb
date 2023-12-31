package com.tb.manager;

import com.tb.domain.e10.dto.PoArrivalInspectionDto;
import com.tb.domain.e10.request.PoArrivalInspectionRequest;

public interface PoArrivalInspectionManager {

    PoArrivalInspectionDto getPoArrivalInspectionListByCondition(PoArrivalInspectionRequest request);
}
