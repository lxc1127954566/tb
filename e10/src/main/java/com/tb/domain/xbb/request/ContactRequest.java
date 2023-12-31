package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactRequest {

    private String text_1;
    private String text_2;

    @Override
    public String toString() {
        return "ContactRequest{" +
                "text_1='" + text_1 + '\'' +
                ", text_2='" + text_2 + '\'' +
                '}';
    }
}
