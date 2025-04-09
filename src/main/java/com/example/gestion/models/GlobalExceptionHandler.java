//package com.example.gestion.models;
//import com.example.gestion.models.Produit;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;



//public class GlobalExceptionHandler {
//        @ExceptionHandler(ProduitNotFoundException.class)
//        public ResponseEntity<String> handleProduitNotFound(ProduitNotFoundException ex) {
//            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//        }
//
//        @ExceptionHandler(InsufficientStockException.class)
//        public ResponseEntity<String> handleInsufficientStock(InsufficientStockException ex) {
//            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
//        }
//
//        @ExceptionHandler(Exception.class)
//        public ResponseEntity<String> handleGenericException(Exception ex) {
//            return new ResponseEntity<>("Une erreur interne est survenue", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }


