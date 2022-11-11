package com.exacttarget.fuelsdk;

public class ETTokenRequestException extends ETSdkException {

    private final int responseCode;

    public ETTokenRequestException(int responseCode, String message) {
        super(message);
        this.responseCode = responseCode;
    }

    public int getResponseCode() {
        return responseCode;
    }
}
