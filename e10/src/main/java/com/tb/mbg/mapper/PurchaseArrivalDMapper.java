package com.tb.mbg.mapper;

import com.tb.mbg.model.PurchaseArrivalD;
import com.tb.mbg.model.PurchaseArrivalDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseArrivalDMapper {
    long countByExample(PurchaseArrivalDExample example);

    int deleteByExample(PurchaseArrivalDExample example);

    int deleteByPrimaryKey(String purchaseArrivalDId);

    int insert(PurchaseArrivalD row);

    int insertSelective(PurchaseArrivalD row);

    List<PurchaseArrivalD> selectByExampleWithBLOBs(PurchaseArrivalDExample example);

    List<PurchaseArrivalD> selectByExample(PurchaseArrivalDExample example);

    PurchaseArrivalD selectByPrimaryKey(String purchaseArrivalDId);

    int updateByExampleSelective(@Param("row") PurchaseArrivalD row, @Param("example") PurchaseArrivalDExample example);

    int updateByExampleWithBLOBs(@Param("row") PurchaseArrivalD row, @Param("example") PurchaseArrivalDExample example);

    int updateByExample(@Param("row") PurchaseArrivalD row, @Param("example") PurchaseArrivalDExample example);

    int updateByPrimaryKeySelective(PurchaseArrivalD row);

    int updateByPrimaryKeyWithBLOBs(PurchaseArrivalD row);

    int updateByPrimaryKey(PurchaseArrivalD row);
}