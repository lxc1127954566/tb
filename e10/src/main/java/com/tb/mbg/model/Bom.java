package com.tb.mbg.model;

import lombok.Data;

import java.util.List;

@Data
public class Bom {

    private String plantName;
    private String mainItemCode;
    private String mainItemName;
    private String mainItemSpecification;
    private String routingDes;
    private String bomId;
    private List<BomD> bomDS;
    private String approveStatus;
    private String userName;
}
