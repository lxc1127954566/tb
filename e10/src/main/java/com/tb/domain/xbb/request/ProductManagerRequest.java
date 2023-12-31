package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductManagerRequest {

    private String corpId;
    private String userId;
    private XBBRequest product;

}
