package com.tb.mbg.mapper;

import com.tb.mbg.model.CustomerFicategory;
import com.tb.mbg.model.CustomerFicategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerFicategoryMapper {
    long countByExample(CustomerFicategoryExample example);

    int deleteByExample(CustomerFicategoryExample example);

    int deleteByPrimaryKey(String customerFicategoryId);

    int insert(CustomerFicategory row);

    int insertSelective(CustomerFicategory row);

    List<CustomerFicategory> selectByExampleWithBLOBs(CustomerFicategoryExample example);

    List<CustomerFicategory> selectByExample(CustomerFicategoryExample example);

    CustomerFicategory selectByPrimaryKey(String customerFicategoryId);

    int updateByExampleSelective(@Param("row") CustomerFicategory row, @Param("example") CustomerFicategoryExample example);

    int updateByExampleWithBLOBs(@Param("row") CustomerFicategory row, @Param("example") CustomerFicategoryExample example);

    int updateByExample(@Param("row") CustomerFicategory row, @Param("example") CustomerFicategoryExample example);

    int updateByPrimaryKeySelective(CustomerFicategory row);

    int updateByPrimaryKeyWithBLOBs(CustomerFicategory row);

    int updateByPrimaryKey(CustomerFicategory row);
}