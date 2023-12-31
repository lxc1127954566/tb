package com.tb.domain.e10.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CustomerFiManagerRequest {

    private String customerId;
    private String customerFiId;
    private String customerFicategoryId;
    private String currencyId;
    private String submitId;
    private String companyId;
}
