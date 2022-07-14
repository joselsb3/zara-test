package com.zara.interview.test.domain.exception;

public class PriceNotFound extends RuntimeException{

    public PriceNotFound(String message) {
        super(message);
    }
}
