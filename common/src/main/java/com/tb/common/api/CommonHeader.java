package com.tb.common.api;

import lombok.Data;

@Data
public class CommonHeader {

    private String host;
    private String xAcsDingtalkAccessToken;
    private String contentType;
}
