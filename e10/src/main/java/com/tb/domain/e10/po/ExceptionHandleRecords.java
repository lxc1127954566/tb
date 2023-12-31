package com.tb.domain.e10.po;
public class ExceptionHandleRecords {

    private String url;
    private String method;
    private long time;
    private String params;
    private String result;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ExceptionHandleRecords() { }

    public ExceptionHandleRecords(String url, String method, long time, String params, String result) {
        this.url = url;
        this.method = method;
        this.time = time;
        this.params = params;
        this.result = result;
    }

    @Override
    public String toString() {
        return "{" +
                "\"url\":\"" + url + '\"' +
                ", \"method\":\"" + method + '\"' +
                ", \"time\":" + time +
                ", \"params\":\"" + params + '\"' +
                ", \"result\":\"" + result + '\"' +
                '}';
    }
}
