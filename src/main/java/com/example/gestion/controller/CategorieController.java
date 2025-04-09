package com.example.gestion.controller;

import com.example.gestion.controller.api.CategorieApi;
import com.example.gestion.dto.CategorieDto;
import com.example.gestion.services.CategorieService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.List;

@RestController
@Validated  // Ajouté pour activer la validation
public class CategorieController implements CategorieApi {
    private final CategorieService categorieService;


    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @Override
    public ResponseEntity<Map<String, Object>> saveCategorie(CategorieDto dto) {
        CategorieDto savedCategorie = categorieService.save(dto);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "Catégorie ajoutée avec succès !");
        response.put("status", "200");
        return ResponseEntity.ok(response);
    }

    @Override
    public List<CategorieDto> findAll() {
        return categorieService.findAll();
    }

    @Override
    public CategorieDto findById(Integer id){
        return categorieService.findById(id);
    }

    @Override
    public ResponseEntity<Map<String, Object>> modifyCategorie(CategorieDto dto, Integer id) {
        CategorieDto updatedCategorie = categorieService.modify(dto, id);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "Catégorie modifiée avec succès !");
        response.put("status", "200");
        response.put("categorie", updatedCategorie);

        return ResponseEntity.ok(response);
    }


    @Override
    public void delete(Integer id) {
        categorieService.delete(id);
    }


}
