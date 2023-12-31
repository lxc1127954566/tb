package com.tb.domain.e10.request;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Builder
public class CustomerManagerRequest {

    private String customerBusinessId;
    private String submitId;
    private String customerCode;
    private String customerName;
    private String customerFullName;
    private String shortcut;
    private BigDecimal capital;
    private BigDecimal turnover;
    private Integer staffs;
    private Date setupDate;
    private Date shutoutDate;
    private Integer branches;
    private String remark;
    private String regAddress;
    private Boolean innerCustomer;
    private String bpClusterId;
    private String principal;
    private String generalCurrencyId;
    private Date createDate;
    private Date lastModifiedDate;
}
