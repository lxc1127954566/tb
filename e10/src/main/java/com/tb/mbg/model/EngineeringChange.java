package com.tb.mbg.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author linxc
 * @date 2023/11/13
 * */
@Data
public class EngineeringChange {

    private String docNo;
    private Date docDate;
    private String docName;
    private String plantName;
    private String description;
    private String content;
    private String reasonDesc;
    private String employeeName;
    private String adminUnitName;
    private String ecnId;
    private List<EngineeringChangeBOMChange> bomChange;
}
