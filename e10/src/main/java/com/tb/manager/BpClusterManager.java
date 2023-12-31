package com.tb.manager;

import com.tb.domain.e10.dto.BpClusterDto;
import com.tb.domain.e10.request.BpClusterRequest;

/**
 * @author linxc
 * @description 交易对象群组信息接口
 * */
public interface BpClusterManager {

    /**
     * 通过交易对象群组类型交易对象群组信息
     */
    BpClusterDto getBpClusterListByCondition(BpClusterRequest request);
}
