package com.tb.mbg.mapper;

import com.tb.mbg.model.PoArrivalInspection;
import com.tb.mbg.model.PoArrivalInspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoArrivalInspectionMapper {
    long countByExample(PoArrivalInspectionExample example);

    int deleteByExample(PoArrivalInspectionExample example);

    int deleteByPrimaryKey(String poArrivalInspectionId);

    int insert(PoArrivalInspection row);

    int insertSelective(PoArrivalInspection row);

    List<PoArrivalInspection> selectByExampleWithBLOBs(PoArrivalInspectionExample example);

    List<PoArrivalInspection> selectByExample(PoArrivalInspectionExample example);

    PoArrivalInspection selectByPrimaryKey(String poArrivalInspectionId);

    int updateByExampleSelective(@Param("row") PoArrivalInspection row, @Param("example") PoArrivalInspectionExample example);

    int updateByExampleWithBLOBs(@Param("row") PoArrivalInspection row, @Param("example") PoArrivalInspectionExample example);

    int updateByExample(@Param("row") PoArrivalInspection row, @Param("example") PoArrivalInspectionExample example);

    int updateByPrimaryKeySelective(PoArrivalInspection row);

    int updateByPrimaryKeyWithBLOBs(PoArrivalInspection row);

    int updateByPrimaryKey(PoArrivalInspection row);
}