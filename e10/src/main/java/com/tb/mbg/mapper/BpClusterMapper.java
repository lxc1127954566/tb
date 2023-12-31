package com.tb.mbg.mapper;

import com.tb.mbg.model.BpCluster;
import com.tb.mbg.model.BpClusterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BpClusterMapper {
    long countByExample(BpClusterExample example);

    int deleteByExample(BpClusterExample example);

    int deleteByPrimaryKey(String bpClusterId);

    int insert(BpCluster row);

    int insertSelective(BpCluster row);

    List<BpCluster> selectByExampleWithBLOBs(BpClusterExample example);

    List<BpCluster> selectByExample(BpClusterExample example);

    BpCluster selectByPrimaryKey(String bpClusterId);

    int updateByExampleSelective(@Param("row") BpCluster row, @Param("example") BpClusterExample example);

    int updateByExampleWithBLOBs(@Param("row") BpCluster row, @Param("example") BpClusterExample example);

    int updateByExample(@Param("row") BpCluster row, @Param("example") BpClusterExample example);

    int updateByPrimaryKeySelective(BpCluster row);

    int updateByPrimaryKeyWithBLOBs(BpCluster row);

    int updateByPrimaryKey(BpCluster row);
}