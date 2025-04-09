package com.example.gestion.controller.api;
import com.example.gestion.dto.CommandeDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CommandeApi {
    @PostMapping(value = "/Commande/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    CommandeDto saveCommande(@RequestBody CommandeDto dto);

    @GetMapping(value="/Commande/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<CommandeDto> findAll();
}
