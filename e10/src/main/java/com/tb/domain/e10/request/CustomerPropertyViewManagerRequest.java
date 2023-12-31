package com.tb.domain.e10.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerPropertyViewManagerRequest {

    private String customerId;
    private String customerPropertyViewId;
    private String p5;
    private String p6;
    private String p7;
}
