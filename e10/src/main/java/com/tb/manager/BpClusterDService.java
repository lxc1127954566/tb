package com.tb.manager;

import com.tb.domain.e10.dto.BpClusterDDto;

/**
 * @author linxc
 * @description 交易对象群组属性信息接口
 * */
public interface BpClusterDService {

    /**
     * 通过交易对象群组主键查找交易对象群组属性信息列表
     * */
    BpClusterDDto getBpClusterDByBpClusterPrimary(String primaryKey);

    /**
     * 通过交易对象群组属性信息主键查询
     * */
    BpClusterDDto getBpClusterDById(String id);
}
