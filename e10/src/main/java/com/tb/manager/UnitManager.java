package com.tb.manager;

import com.tb.domain.e10.dto.UnitManagerDto;
import com.tb.domain.e10.request.UnitManagerRequest;

/**
 * 登录用户业务接口
 *
 * @author linxc
 * @date 2023/12/25
 * */
public interface UnitManager {

    /**
     * 通过索引条件获取单位数据列表
     * */
    UnitManagerDto getUnitListByCondition(UnitManagerRequest request);
}
