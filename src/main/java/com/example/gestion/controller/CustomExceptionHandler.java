//package com.example.gestion.controller;
//
//import com.example.gestion.exception.ApiError;
//import com.example.gestion.exception.ProduitNotFound;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class CustomExceptionHandler {
//    @ExceptionHandler(ProduitNotFound.class)
//    public ResponseEntity<ApiError> handlerProduitNotFound(ProduitNotFound e) {
//        ApiError apiError = new ApiError();
//        apiError.setMessage(e.getMessage());
//        apiError.setCode(HttpStatus.NOT_FOUND.value());
//        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
//    }
//}
