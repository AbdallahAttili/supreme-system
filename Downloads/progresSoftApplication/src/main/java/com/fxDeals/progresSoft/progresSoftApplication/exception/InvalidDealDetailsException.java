package com.fxDeals.progresSoft.progresSoftApplication.exception;

public class InvalidDealDetailsException extends RuntimeException {
    public InvalidDealDetailsException() {
    }

    public InvalidDealDetailsException(String message) {
        super(message);
    }
}
