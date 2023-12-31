package com.tb.mbg.mapper;

import com.tb.mbg.model.FeatureGroup;
import com.tb.mbg.model.FeatureGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeatureGroupMapper {
    long countByExample(FeatureGroupExample example);

    int deleteByExample(FeatureGroupExample example);

    int deleteByPrimaryKey(String featureGroupId);

    int insert(FeatureGroup row);

    int insertSelective(FeatureGroup row);

    List<FeatureGroup> selectByExampleWithBLOBs(FeatureGroupExample example);

    List<FeatureGroup> selectByExample(FeatureGroupExample example);

    FeatureGroup selectByPrimaryKey(String featureGroupId);

    int updateByExampleSelective(@Param("row") FeatureGroup row, @Param("example") FeatureGroupExample example);

    int updateByExampleWithBLOBs(@Param("row") FeatureGroup row, @Param("example") FeatureGroupExample example);

    int updateByExample(@Param("row") FeatureGroup row, @Param("example") FeatureGroupExample example);

    int updateByPrimaryKeySelective(FeatureGroup row);

    int updateByPrimaryKeyWithBLOBs(FeatureGroup row);

    int updateByPrimaryKey(FeatureGroup row);
}