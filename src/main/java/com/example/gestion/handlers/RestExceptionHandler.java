package com.example.gestion.handlers;

import com.example.gestion.exception.EntityNotFoundException;
import com.example.gestion.exception.InvalideEntityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    // Gestion de l'exception EntityNotFoundException (personnalisée)
    @ExceptionHandler({ EntityNotFoundException.class })
    public ResponseEntity<ErrorDto> handleEntityNotFoundException(
            Exception exception, WebRequest webRequest
    ) {
        // Code de statut HTTP 404 (Not Found)
        final HttpStatus notFound = HttpStatus.NOT_FOUND;

        // Création de l'instance d'ErrorDto avec les détails de l'erreur
        ErrorDto errorDto = ErrorDto.builder()
                .httpCode(notFound.value())
                .message(exception.getMessage())
                .build();

        // Retourne la réponse avec l'ErrorDto
        return new ResponseEntity<>(errorDto, notFound);
    }

    // Gestion de l'exception InvalideEntityException (personnalisée)
    @ExceptionHandler(InvalideEntityException.class)
    public ResponseEntity<ErrorDto> handleInvalideEntityException(
            InvalideEntityException exception, WebRequest webRequest
    ) {
        //        // Code de statut HTTP 400 (Bad Request)
        final HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        // Création de l'instance d'ErrorDto avec les détails de l'erreur
        ErrorDto errorDto = ErrorDto.builder()
//                .code(exception.getErrorCode())  // Assurez-vous d'avoir un code d'erreur dans l'exception
                .httpCode(badRequest.value())
                .message(exception.getMessage())
//                .errors(exception.getErrors())  // Si l'exception a des erreurs spécifiques
                .build();

        // Retourne la réponse avec l'ErrorDto
        return new ResponseEntity<>(errorDto, badRequest);
    }
}
