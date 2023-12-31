package com.tb.common.exception;

import lombok.Getter;

/**
 * 异常枚举
 * */
public enum TBE10ExceptionEnum implements TBExceptionEnum{
    INSERT_FAILED(5001, "数据插入失败!"),
    UPDATE_FAILED(5002, "数据更新失败"),
    NO_DATA_WAS_OBTAINED(5003, "未获取到数据")
    ;

    private int code;
    private String message;

    TBE10ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
