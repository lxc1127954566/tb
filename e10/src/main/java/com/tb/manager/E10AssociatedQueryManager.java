package com.tb.manager;

import com.tb.mbg.model.*;

import java.util.Date;
import java.util.List;

public interface E10AssociatedQueryManager {

    /**
     * 获取无开A519销售订单列表
     */
    List<HasntA519OrderModel> getHastA519OrderList(Date date);

    /**
     * 获取当前品号总出货量
     */
    List<QuantityOfShipment> getQuantityOfShipment(String itemName);

    /**
     * 获取仓库中有库存的品号清单
     */
    List<ProductionOfHasInventory> getProductionOfHasInventoryList(String warehouseId);

    /**
     * 获取待检采购订单明细列表
     */
    List<PurchaseArrivalModel> getPurchaseArrivalList(Date date);

    /**
     * 获取审核后的工程变更单列表
     */
    List<EngineeringChange> getEngineeringChangeList(Date date);

    /**
     * 通过变更单id获取BOM变更明细
     */
    List<EngineeringChangeBOMChange> getEngineeringChangeBOMChangeList(String bomId);

    /**
     * 获取时间段内新增的BOM
     */
    List<Bom> getNewBom(Date date);

    /**
     * 通过bomId获取Bom变更明细
     */
    List<BomD> getBomDByBomId(String bomId);
}
