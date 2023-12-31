package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressRequest {

    private String province;
    private String address;

    @Override
    public String toString() {
        return "AddressRequest{" +
                "province='" + province + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
