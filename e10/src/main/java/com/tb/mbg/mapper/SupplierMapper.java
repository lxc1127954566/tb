package com.tb.mbg.mapper;

import com.tb.mbg.model.Supplier;
import com.tb.mbg.model.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(String supplierBusinessId);

    int insert(Supplier row);

    int insertSelective(Supplier row);

    List<Supplier> selectByExampleWithBLOBs(SupplierExample example);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(String supplierBusinessId);

    int updateByExampleSelective(@Param("row") Supplier row, @Param("example") SupplierExample example);

    int updateByExampleWithBLOBs(@Param("row") Supplier row, @Param("example") SupplierExample example);

    int updateByExample(@Param("row") Supplier row, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier row);

    int updateByPrimaryKeyWithBLOBs(Supplier row);

    int updateByPrimaryKey(Supplier row);
}