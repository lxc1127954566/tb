package com.tb.manager;

import com.tb.domain.e10.dto.ItemManagerDto;
import com.tb.domain.e10.request.ItemManagerRequest;

/**
 * 通用品号信息业务接口
 * */
public interface ItemManager {

    ItemManagerDto getItemManagerByCondition(ItemManagerRequest request);
}
