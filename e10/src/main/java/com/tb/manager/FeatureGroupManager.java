package com.tb.manager;

import com.tb.domain.e10.dto.FeatureGroupManagerDto;
import com.tb.domain.e10.request.FeatureGroupManagerRequest;

public interface FeatureGroupManager {

    FeatureGroupManagerDto getFeatureGroupListByCondition(FeatureGroupManagerRequest request);
}
