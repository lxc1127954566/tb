package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest implements XBBRequest{

    private String name;
    private String serialNo;
    private String unit;
    private String sort;
}
