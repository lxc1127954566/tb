package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FormManagerRequest {

    private String name;
    private int saasMark;
    private int businessType;
    private String corpid;
    private String userId;
}
