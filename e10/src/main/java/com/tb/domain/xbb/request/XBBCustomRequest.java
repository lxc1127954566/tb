package com.tb.domain.xbb.request;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class XBBCustomRequest implements Serializable {
    private static final long serialVersionUID = 4599536762259105108L;

    private String simpleName;
    private String fullName;
    private List<ContactRequest> contactSort;
    private AddressRequest address;
    private String status;
    private String ownerId;
    private String area;
}
