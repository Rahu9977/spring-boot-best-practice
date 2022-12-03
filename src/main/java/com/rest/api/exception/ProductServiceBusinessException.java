package com.rest.api.exception;

public class ProductServiceBusinessException extends RuntimeException{

    public ProductServiceBusinessException(String message) {
        super(message);
    }
}
