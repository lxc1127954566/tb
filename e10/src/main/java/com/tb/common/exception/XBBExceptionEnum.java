package com.tb.common.exception;

public enum XBBExceptionEnum implements TBExceptionEnum{
    XBB_INSERT_FAILED(5201, "销帮帮数据插入失败")
    ;

    private int code;
    private String msg;

    XBBExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }
}
