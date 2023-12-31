package com.tb.common.exception;

public enum YiDaConcreteExceptionEnum implements TBExceptionEnum {

    TOKEN_GET_FAILED(5101, "token获取失败");

    private int code;
    private String message;

    YiDaConcreteExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
