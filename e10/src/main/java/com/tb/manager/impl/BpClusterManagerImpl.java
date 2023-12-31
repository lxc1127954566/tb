package com.tb.manager.impl;

import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.BpClusterDto;
import com.tb.domain.e10.request.BpClusterRequest;
import com.tb.manager.BpClusterManager;
import com.tb.mbg.mapper.BpClusterMapper;
import com.tb.mbg.model.BpCluster;
import com.tb.mbg.model.BpClusterExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author linxc
 * @description 交易对象群组信息接口业务实现
 * */
@Manager
public class BpClusterManagerImpl implements BpClusterManager {

    @Autowired
    private BpClusterMapper bpClusterMapper;

    @Override
    public BpClusterDto getBpClusterListByCondition(BpClusterRequest request) {
        BpClusterExample example = new BpClusterExample();
        BpClusterExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getBpType())) {
            criteria.andBpTypeEqualTo(request.getBpType());
        }
        if (!StringUtils.isEmpty(request.getBpClusterCode())) {
            criteria.andBpClusterCodeLike(request.getBpClusterCode());
        }
        if (!StringUtils.isEmpty(request.getBpClusterName())) {
            criteria.andBpClusterNameLike(request.getBpClusterName());
        }
        List<BpCluster> bpClusters = bpClusterMapper.selectByExample(example);
        BpClusterDto bpClusterDto = new BpClusterDto();
        bpClusterDto.setBpClusterList(bpClusters);
        return bpClusterDto;
    }
}
