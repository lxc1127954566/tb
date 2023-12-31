package com.tb.domain.e10.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class IQCVo implements Serializable {

    private static final long serialVersionUID = 5453176548834969712L;
    private String company;
    private String docNo;
    private String arrivalListDocNo;
    private String supplier;
    private Date docDate;
    private Date inspectionDate;
    private String itemCode;
    private String itemName;
    private String specification;
    private String submitForInspectionAdminUnit;
    private String submitForInspectionPerson;
    private BigDecimal totalCount;
    private BigDecimal qualifiedQuantity;
    private BigDecimal rejectedQuantity;
    private BigDecimal destroyQuantity;
    private String result;
}
