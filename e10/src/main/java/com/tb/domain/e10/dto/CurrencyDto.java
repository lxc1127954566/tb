package com.tb.domain.e10.dto;

import com.tb.mbg.model.Currency;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CurrencyDto {

    private List<Currency> currencyList;
}
