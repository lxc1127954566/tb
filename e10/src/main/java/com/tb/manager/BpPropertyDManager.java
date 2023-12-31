package com.tb.manager;

import com.tb.domain.e10.dto.BpPropertyDDto;
import com.tb.domain.e10.request.BpPropertyDMangerRequest;

/**
 * @author linxc
 * @description 交易对象属性值信息业务接口
 * */
public interface BpPropertyDManager {

    BpPropertyDDto getBpPropertyDByCondition(BpPropertyDMangerRequest request);
}
