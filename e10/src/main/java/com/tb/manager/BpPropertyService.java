package com.tb.manager;

import com.tb.domain.e10.dto.BpPropertyDto;

/**
 * @author linxc
 * @description 交易对象属性信息业务接口
 * */
public interface BpPropertyService {

    BpPropertyDto getBpPropertyById(String id);
}
