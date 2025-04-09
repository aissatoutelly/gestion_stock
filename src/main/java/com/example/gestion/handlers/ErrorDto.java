package com.example.gestion.handlers;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorDto {

    private int httpCode;
    private String message;
//    private String code;  // Peut être un code d'erreur
//    private String errors; // Si des erreurs supplémentaires doivent être renvoyées (peut être null)

}
