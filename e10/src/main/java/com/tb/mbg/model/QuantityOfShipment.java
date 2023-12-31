package com.tb.mbg.model;

import lombok.Data;

/**
 * 品号总出货量
 *
 * @author linxc
 * @date 2023/11/10
 * */
@Data
public class QuantityOfShipment {

    private String itemCode;
    private String itemName;
    private Long businessQty;
}
