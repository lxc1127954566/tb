package com.tb.domain.yida.dto;

import lombok.Data;

@Data
public class TokenResponseDto {

    private long errcode;
    private String access_token;
    private String errmsg;
    private long expires_in;
}
