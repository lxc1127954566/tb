package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class CustomRequest implements XBBRequest{

    private String text_2;
    private String text_1;
    private List<ContactRequest> subForm_1;
    private AddressRequest address_1;
    private String text_4;
    private List<String> ownerId;
    private String text_16;
    private int num_5;

    @Override
    public String toString() {
        return "CustomRequest{" +
                "text_2='" + text_2 + '\'' +
                ", text_1='" + text_1 + '\'' +
                ", subForm_1=" + Arrays.deepToString(subForm_1.toArray()) +
                ", address_1=" + address_1.toString() +
                ", text_4='" + text_4 + '\'' +
                ", ownerId=" + ownerId +
                ", text_16='" + text_16 + '\'' +
                ", num_5=" + num_5 +
                '}';
    }
}
