package com.tb.domain.yida.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessTokenResponse {

    private long errcode;
    private String access_token;
    private String errmsg;
    private long expires_in;
}
