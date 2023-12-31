package com.tb.manager.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.util.StringUtils;
import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.ItemManagerDto;
import com.tb.domain.e10.request.ItemManagerRequest;
import com.tb.manager.ItemManager;
import com.tb.mbg.mapper.ItemMapper;
import com.tb.mbg.model.Item;
import com.tb.mbg.model.ItemExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class ItemManagerImpl implements ItemManager {

    @Autowired
    private ItemMapper mapper;

    @Override
    public ItemManagerDto getItemManagerByCondition(ItemManagerRequest request) {
        ItemExample example = new ItemExample();
        ItemExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(request.getItemCode())){
            criteria.andItemBusinessIdEqualTo(request.getItemId());
        }
        if (!StringUtils.isEmpty(request.getItemCode())){
            criteria.andItemCodeEqualTo(request.getItemCode());
        }
        if (!StringUtils.isEmpty(request.getItemName())){
            criteria.andItemNameEqualTo(request.getItemName());
        }
        if (ObjectUtil.isNotEmpty(request.getCreateTime())){
            criteria.andCreatedateGreaterThanOrEqualTo(request.getCreateTime());
        }
        if (ObjectUtil.isNotEmpty(request.getCreateTime())){
            criteria.andLastmodifieddateGreaterThanOrEqualTo(request.getLastUpdateTime());
        }
        List<Item> items = mapper.selectByExample(example);
        ItemManagerDto dto = new ItemManagerDto();
        dto.setItemList(items);
        return dto;
    }
}
