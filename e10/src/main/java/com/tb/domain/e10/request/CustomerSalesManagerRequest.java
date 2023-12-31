package com.tb.domain.e10.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerSalesManagerRequest {

    private String customerId;
    private String taxSortId;
    private String currencyId;
    private String userId;
    private String deptId;
    private String salesAreaId;
    private String customerSalesId;
}
