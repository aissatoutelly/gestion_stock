package com.example.gestion.exception;

import lombok.Getter;

public class InvalideEntityException extends RuntimeException {

    @Getter
    private String errorCode;
    @Getter
    private String errors;  // Si cette exception contient des erreurs supplémentaires

    public InvalideEntityException(String message, String errorCode, String errors) {
        super(message);
        this.errorCode = errorCode;
        this.errors = errors;
    }

    public InvalideEntityException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
