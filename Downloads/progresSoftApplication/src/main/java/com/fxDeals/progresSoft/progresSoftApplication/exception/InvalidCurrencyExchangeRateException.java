package com.fxDeals.progresSoft.progresSoftApplication.exception;

public class InvalidCurrencyExchangeRateException extends RuntimeException {
    public InvalidCurrencyExchangeRateException() {
    }

    public InvalidCurrencyExchangeRateException(String message) {
        super(message);
    }
}
