package com.tb.domain.e10.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ItemManagerRequest {

    private String itemId;
    private String itemCode;
    private String itemName;
    private String status;
    private Date createTime;
    private Date lastUpdateTime;
}
