package com.tb.mbg.mapper;

import com.tb.mbg.model.Unit;
import com.tb.mbg.model.UnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitMapper {
    long countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(String unitId);

    int insert(Unit row);

    int insertSelective(Unit row);

    List<Unit> selectByExampleWithBLOBs(UnitExample example);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(String unitId);

    int updateByExampleSelective(@Param("row") Unit row, @Param("example") UnitExample example);

    int updateByExampleWithBLOBs(@Param("row") Unit row, @Param("example") UnitExample example);

    int updateByExample(@Param("row") Unit row, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit row);

    int updateByPrimaryKeyWithBLOBs(Unit row);

    int updateByPrimaryKey(Unit row);
}