package com.tb.domain.e10.request;

import lombok.Builder;
import lombok.Getter;

/**
 * @author linxc
 * */
@Getter
@Builder
public class CustomerPropertyRequest {

    private String customerPropertyId;
    private String propertyValue;
    private String remark;
    private String bpPropertyId;
    private String customerId;
    private String propertyValueId;
    private String propertyValueDesc;
    private String submitId;
}
