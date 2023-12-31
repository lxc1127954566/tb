package com.tb.manager;

import com.tb.domain.e10.dto.AdminUnitDto;

/**
 * @author linxc
 * @description 行政单元接口
 * */
public interface AdminManager {

    /**
     * 通过行政单元名称查询
     * */
    AdminUnitDto getAdminUnitListByAdminName(String name);

    /**
     * 通过行政单元id查询
     * */
    AdminUnitDto getAdminUnitListById(String id);
}
