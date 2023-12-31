package com.tb.manager.impl;

import cn.hutool.core.util.BooleanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.FeatureGroupManagerDto;
import com.tb.domain.e10.request.FeatureGroupManagerRequest;
import com.tb.manager.FeatureGroupManager;
import com.tb.mbg.mapper.FeatureGroupMapper;
import com.tb.mbg.model.FeatureGroup;
import com.tb.mbg.model.FeatureGroupExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.util.ByteUtils;

import java.util.List;

@Manager
public class FeatureGroupManagerImpl implements FeatureGroupManager {

    @Autowired
    private FeatureGroupMapper mapper;

    @Override
    public FeatureGroupManagerDto getFeatureGroupListByCondition(FeatureGroupManagerRequest request) {
        FeatureGroupExample example = new FeatureGroupExample();
        FeatureGroupExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getFeatureGroupId())){
            criteria.andFeatureGroupIdEqualTo(request.getFeatureGroupId());
        }
        if (!StringUtils.isEmpty(request.getFeatureGroupCode())){
            criteria.andFeatureGroupCodeEqualTo(request.getFeatureGroupCode());
        }
        if (!StringUtils.isEmpty(request.getFeatureGroupName())){
            criteria.andFeatureGroupNameEqualTo(request.getFeatureGroupName());
        }
        if (!StringUtils.isEmpty(request.getStatus())){
            criteria.andApprovestatusEqualTo(request.getStatus());
        }
        if (ObjectUtil.isNotEmpty(request.isFeatureGroupControl())){
            criteria.andItemFeatureControlEqualTo(request.isFeatureGroupControl());
        }
        List<FeatureGroup> featureGroups = mapper.selectByExample(example);
        FeatureGroupManagerDto dto = new FeatureGroupManagerDto();
        dto.setFeatureGroupList(featureGroups);
        return dto;
    }
}
