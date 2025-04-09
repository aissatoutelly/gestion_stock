package com.example.gestion.controller.api;

import com.example.gestion.dto.CategorieDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface CategorieApi {
    @PostMapping(value = "/categorie/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Map<String, Object>> saveCategorie(@Valid @RequestBody CategorieDto dto);

    @GetMapping(value ="/categorie/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<CategorieDto> findAll();

    @GetMapping(value = "/categorie/{idcategorie}", produces = MediaType.APPLICATION_JSON_VALUE)
    CategorieDto findById(@Valid @PathVariable("idcategorie") Integer id);

    @PutMapping(value = "/categorie/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Map<String, Object>> modifyCategorie(@Valid @RequestBody CategorieDto dto, @PathVariable Integer id);


    @DeleteMapping(value = "/categorie/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    void delete(@PathVariable Integer id);
}
