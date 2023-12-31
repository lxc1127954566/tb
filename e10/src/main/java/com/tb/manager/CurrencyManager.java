package com.tb.manager;

import com.tb.domain.e10.dto.CurrencyDto;
import com.tb.domain.e10.request.CurrencyManagerRequest;

/**
 * @author linxc
 * @description 货币接口
 * */
public interface CurrencyManager {

    CurrencyDto getCurrencyListByCondition(CurrencyManagerRequest request);
}
