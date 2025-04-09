package com.example.gestion.controller.api;
import com.example.gestion.dto.FournisseurDto;
import com.example.gestion.models.Fournisseur;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface FournisseurApi {
    @PostMapping(value = "/Fournisseur/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Map<String, Object>> saveFournisseur(@Valid @RequestBody FournisseurDto dto);

    @GetMapping(value="/Fournisseur/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<FournisseurDto>findAll();

    @PutMapping(value = "Fournisseur/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Map<String, Object>> modifyFournisseur(@Valid @RequestBody FournisseurDto dto, @PathVariable Integer id);

    @GetMapping(value = "/Fournisseur/{idFournisseur}", produces = MediaType.APPLICATION_JSON_VALUE)
    FournisseurDto findById(@Valid @PathVariable("idFournisseur") Integer id);

    @DeleteMapping(value = "/fournisseur/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    void delete(@PathVariable Integer id);
}

