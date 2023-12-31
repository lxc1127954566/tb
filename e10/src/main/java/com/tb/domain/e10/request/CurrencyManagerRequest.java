package com.tb.domain.e10.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyManagerRequest {

    private String currencyName;
    private String currencyCode;
    private String unit;

    public CurrencyManagerRequest() {
    }

    public CurrencyManagerRequest(String currencyName) {
        this.currencyName = currencyName;
    }
}
