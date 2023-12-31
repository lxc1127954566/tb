package com.tb.mbg.mapper;

import com.tb.mbg.model.CsTaxClassification;
import com.tb.mbg.model.CsTaxClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsTaxClassificationMapper {
    long countByExample(CsTaxClassificationExample example);

    int deleteByExample(CsTaxClassificationExample example);

    int deleteByPrimaryKey(String csTaxClassificationId);

    int insert(CsTaxClassification row);

    int insertSelective(CsTaxClassification row);

    List<CsTaxClassification> selectByExampleWithBLOBs(CsTaxClassificationExample example);

    List<CsTaxClassification> selectByExample(CsTaxClassificationExample example);

    CsTaxClassification selectByPrimaryKey(String csTaxClassificationId);

    int updateByExampleSelective(@Param("row") CsTaxClassification row, @Param("example") CsTaxClassificationExample example);

    int updateByExampleWithBLOBs(@Param("row") CsTaxClassification row, @Param("example") CsTaxClassificationExample example);

    int updateByExample(@Param("row") CsTaxClassification row, @Param("example") CsTaxClassificationExample example);

    int updateByPrimaryKeySelective(CsTaxClassification row);

    int updateByPrimaryKeyWithBLOBs(CsTaxClassification row);

    int updateByPrimaryKey(CsTaxClassification row);
}