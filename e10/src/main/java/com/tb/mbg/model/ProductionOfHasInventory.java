package com.tb.mbg.model;

import lombok.Data;

@Data
public class ProductionOfHasInventory {

    private String itemCode;
    private String itemName;
    private Long inventoryQty;
    private String warehouseId;
    private String unitName;
    private String itemSpecification;
    private String warehouseName;

    public ProductionOfHasInventory setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
}
