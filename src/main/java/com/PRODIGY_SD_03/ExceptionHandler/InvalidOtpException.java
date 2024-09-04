package com.PRODIGY_SD_03.ExceptionHandler;

public class InvalidOtpException extends RuntimeException {
    public InvalidOtpException(String message) {
        super(message);
    }
}
