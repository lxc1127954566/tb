package com.tb.domain.e10.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeatureGroupManagerRequest {

    private String featureGroupId;
    private String featureGroupCode;
    private String featureGroupName;
    private String status;
    private boolean featureGroupControl;
}
