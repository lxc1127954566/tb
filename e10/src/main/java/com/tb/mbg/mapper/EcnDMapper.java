package com.tb.mbg.mapper;

import com.tb.mbg.model.EcnD;
import com.tb.mbg.model.EcnDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcnDMapper {
    long countByExample(EcnDExample example);

    int deleteByExample(EcnDExample example);

    int deleteByPrimaryKey(String ecnDId);

    int insert(EcnD row);

    int insertSelective(EcnD row);

    List<EcnD> selectByExampleWithBLOBs(EcnDExample example);

    List<EcnD> selectByExample(EcnDExample example);

    EcnD selectByPrimaryKey(String ecnDId);

    int updateByExampleSelective(@Param("row") EcnD row, @Param("example") EcnDExample example);

    int updateByExampleWithBLOBs(@Param("row") EcnD row, @Param("example") EcnDExample example);

    int updateByExample(@Param("row") EcnD row, @Param("example") EcnDExample example);

    int updateByPrimaryKeySelective(EcnD row);

    int updateByPrimaryKeyWithBLOBs(EcnD row);

    int updateByPrimaryKey(EcnD row);
}