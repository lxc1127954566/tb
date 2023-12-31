package com.tb.mbg.mapper;

import com.tb.mbg.model.Ecn;
import com.tb.mbg.model.EcnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcnMapper {
    long countByExample(EcnExample example);

    int deleteByExample(EcnExample example);

    int deleteByPrimaryKey(String ecnId);

    int insert(Ecn row);

    int insertSelective(Ecn row);

    List<Ecn> selectByExampleWithBLOBs(EcnExample example);

    List<Ecn> selectByExample(EcnExample example);

    Ecn selectByPrimaryKey(String ecnId);

    int updateByExampleSelective(@Param("row") Ecn row, @Param("example") EcnExample example);

    int updateByExampleWithBLOBs(@Param("row") Ecn row, @Param("example") EcnExample example);

    int updateByExample(@Param("row") Ecn row, @Param("example") EcnExample example);

    int updateByPrimaryKeySelective(Ecn row);

    int updateByPrimaryKeyWithBLOBs(Ecn row);

    int updateByPrimaryKey(Ecn row);
}