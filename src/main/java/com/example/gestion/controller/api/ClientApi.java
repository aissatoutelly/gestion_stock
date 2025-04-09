package com.example.gestion.controller.api;
import com.example.gestion.dto.ClientDto;
import com.example.gestion.models.Client;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface ClientApi {
    @PostMapping(value = "/Client/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Map<String, Object>> saveClient(@Valid @RequestBody ClientDto dto);

    @GetMapping(value="/Client/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ClientDto>findAll();
     //List client
    @PutMapping(value = "Client/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Map<String, Object>> modifyClient(@Valid @RequestBody ClientDto dto, @PathVariable Integer id);

    @GetMapping(value = "/Client/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
    ClientDto findById(@Valid @PathVariable("idClient") Integer id);

    @DeleteMapping(value = "/client/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    void delete(@PathVariable Integer id);
}
