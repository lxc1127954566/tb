package com.tb.mbg.mapper;

import com.tb.mbg.model.BpPropertyD;
import com.tb.mbg.model.BpPropertyDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BpPropertyDMapper {
    long countByExample(BpPropertyDExample example);

    int deleteByExample(BpPropertyDExample example);

    int deleteByPrimaryKey(String bpPropertyDId);

    int insert(BpPropertyD row);

    int insertSelective(BpPropertyD row);

    List<BpPropertyD> selectByExampleWithBLOBs(BpPropertyDExample example);

    List<BpPropertyD> selectByExample(BpPropertyDExample example);

    BpPropertyD selectByPrimaryKey(String bpPropertyDId);

    int updateByExampleSelective(@Param("row") BpPropertyD row, @Param("example") BpPropertyDExample example);

    int updateByExampleWithBLOBs(@Param("row") BpPropertyD row, @Param("example") BpPropertyDExample example);

    int updateByExample(@Param("row") BpPropertyD row, @Param("example") BpPropertyDExample example);

    int updateByPrimaryKeySelective(BpPropertyD row);

    int updateByPrimaryKeyWithBLOBs(BpPropertyD row);

    int updateByPrimaryKey(BpPropertyD row);
}