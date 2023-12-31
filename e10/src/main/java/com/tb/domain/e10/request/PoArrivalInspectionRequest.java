package com.tb.domain.e10.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PoArrivalInspectionRequest {

    private String id;
    private Date createDate;
    private Date lastModifiedDate;
    private String approveStatus;
}
