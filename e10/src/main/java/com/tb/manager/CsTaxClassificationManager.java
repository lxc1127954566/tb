package com.tb.manager;

import com.tb.domain.e10.dto.CsTaxClassificationDto;
import com.tb.domain.e10.request.CsTaxClassificationManagerRequest;

public interface CsTaxClassificationManager {

    CsTaxClassificationDto getCsTaxClassificationByCondition(CsTaxClassificationManagerRequest request);
}
