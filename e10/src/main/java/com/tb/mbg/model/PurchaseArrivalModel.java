package com.tb.mbg.model;

import lombok.Data;

import java.util.Date;

/**
 * @author linxc
 * @date 2023/11/22
 * */
@Data
public class PurchaseArrivalModel {

    private String itemCode;
    private String itemDescription;
    private String itemSpecification;
    private String docNo;
    private Date lastModifiedDate;
    private String supplierName;
    private String inspectionStatus;
    private double businessQty;
    private String supplyCenterName;
    private String unitName;
}
