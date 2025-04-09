package com.example.gestion.exception;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException {

    @Getter
    private String errorCode;

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntityNotFoundException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
