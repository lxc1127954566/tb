package com.tb.mbg.mapper;

import com.tb.mbg.model.SalesCenter;
import com.tb.mbg.model.SalesCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesCenterMapper {
    long countByExample(SalesCenterExample example);

    int deleteByExample(SalesCenterExample example);

    int deleteByPrimaryKey(String salesCenterId);

    int insert(SalesCenter row);

    int insertSelective(SalesCenter row);

    List<SalesCenter> selectByExampleWithBLOBs(SalesCenterExample example);

    List<SalesCenter> selectByExample(SalesCenterExample example);

    SalesCenter selectByPrimaryKey(String salesCenterId);

    int updateByExampleSelective(@Param("row") SalesCenter row, @Param("example") SalesCenterExample example);

    int updateByExampleWithBLOBs(@Param("row") SalesCenter row, @Param("example") SalesCenterExample example);

    int updateByExample(@Param("row") SalesCenter row, @Param("example") SalesCenterExample example);

    int updateByPrimaryKeySelective(SalesCenter row);

    int updateByPrimaryKeyWithBLOBs(SalesCenter row);

    int updateByPrimaryKey(SalesCenter row);
}