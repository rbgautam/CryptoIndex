package com.cryptoindex.data.models;

import com.squareup.moshi.Json;

public class Status {

    @Json(name = "timestamp")
    private String timestamp;
    @Json(name = "error_code")
    private Integer errorCode;
    @Json(name = "error_message")
    private Object errorMessage;
    @Json(name = "elapsed")
    private Integer elapsed;
    @Json(name = "credit_count")
    private Integer creditCount;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Integer getElapsed() {
        return elapsed;
    }

    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    public Integer getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(Integer creditCount) {
        this.creditCount = creditCount;
    }

}