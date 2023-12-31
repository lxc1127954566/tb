package com.tb.mbg.mapper;

import com.tb.mbg.model.AdminUnit;
import com.tb.mbg.model.AdminUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUnitMapper {
    long countByExample(AdminUnitExample example);

    int deleteByExample(AdminUnitExample example);

    int deleteByPrimaryKey(String adminUnitId);

    int insert(AdminUnit row);

    int insertSelective(AdminUnit row);

    List<AdminUnit> selectByExampleWithBLOBs(AdminUnitExample example);

    List<AdminUnit> selectByExample(AdminUnitExample example);

    AdminUnit selectByPrimaryKey(String adminUnitId);

    int updateByExampleSelective(@Param("row") AdminUnit row, @Param("example") AdminUnitExample example);

    int updateByExampleWithBLOBs(@Param("row") AdminUnit row, @Param("example") AdminUnitExample example);

    int updateByExample(@Param("row") AdminUnit row, @Param("example") AdminUnitExample example);

    int updateByPrimaryKeySelective(AdminUnit row);

    int updateByPrimaryKeyWithBLOBs(AdminUnit row);

    int updateByPrimaryKey(AdminUnit row);
}