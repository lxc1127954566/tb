package com.tb.common.exception;

import org.springframework.util.StringUtils;

public class TBConcreteException extends RuntimeException{

    private int code;

    public TBConcreteException(String message){
        super(StringUtils.isEmpty(message) ? "unknow exception" : message);
    }

    public TBConcreteException(String message, int code) {
        super(message);
        this.code = code;
    }

    public TBConcreteException(TBExceptionEnum tbee){
        super(tbee.getMessage());
        this.code = tbee.getCode();
    }

    public int getCode() {
        return code;
    }
}
