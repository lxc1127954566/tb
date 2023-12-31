package com.tb.mbg.mapper;

import com.tb.mbg.model.BpProperty;
import com.tb.mbg.model.BpPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BpPropertyMapper {
    long countByExample(BpPropertyExample example);

    int deleteByExample(BpPropertyExample example);

    int deleteByPrimaryKey(String bpPropertyId);

    int insert(BpProperty row);

    int insertSelective(BpProperty row);

    List<BpProperty> selectByExampleWithBLOBs(BpPropertyExample example);

    List<BpProperty> selectByExample(BpPropertyExample example);

    BpProperty selectByPrimaryKey(String bpPropertyId);

    int updateByExampleSelective(@Param("row") BpProperty row, @Param("example") BpPropertyExample example);

    int updateByExampleWithBLOBs(@Param("row") BpProperty row, @Param("example") BpPropertyExample example);

    int updateByExample(@Param("row") BpProperty row, @Param("example") BpPropertyExample example);

    int updateByPrimaryKeySelective(BpProperty row);

    int updateByPrimaryKeyWithBLOBs(BpProperty row);

    int updateByPrimaryKey(BpProperty row);
}