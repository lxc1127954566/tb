package com.tb.mbg.mapper;

import com.tb.mbg.model.BpClusterD;
import com.tb.mbg.model.BpClusterDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BpClusterDMapper {
    long countByExample(BpClusterDExample example);

    int deleteByExample(BpClusterDExample example);

    int deleteByPrimaryKey(String bpClusterDId);

    int insert(BpClusterD row);

    int insertSelective(BpClusterD row);

    List<BpClusterD> selectByExampleWithBLOBs(BpClusterDExample example);

    List<BpClusterD> selectByExample(BpClusterDExample example);

    BpClusterD selectByPrimaryKey(String bpClusterDId);

    int updateByExampleSelective(@Param("row") BpClusterD row, @Param("example") BpClusterDExample example);

    int updateByExampleWithBLOBs(@Param("row") BpClusterD row, @Param("example") BpClusterDExample example);

    int updateByExample(@Param("row") BpClusterD row, @Param("example") BpClusterDExample example);

    int updateByPrimaryKeySelective(BpClusterD row);

    int updateByPrimaryKeyWithBLOBs(BpClusterD row);

    int updateByPrimaryKey(BpClusterD row);
}