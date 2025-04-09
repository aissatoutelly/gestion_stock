package com.example.gestion.controller;
import com.example.gestion.controller.api.FournisseurApi;
import com.example.gestion.dto.FournisseurDto;
import com.example.gestion.models.Fournisseur;
import com.example.gestion.services.FournisseurService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Validated
@RestController
public class FournisseurController implements FournisseurApi {
    private final  FournisseurService fournisseurService;

    public FournisseurController(FournisseurService fournisseurService){
        this.fournisseurService = fournisseurService;
    }
    @Override
    public ResponseEntity<Map<String, Object>> saveFournisseur(@Valid @RequestBody FournisseurDto dto) {
    FournisseurDto savedFournisseur = fournisseurService.save(dto);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "200");
        response.put("message", "Fournisseur ajouté avec succès !");
        return ResponseEntity.ok(response);
    }

    @Override
    public List<FournisseurDto>findAll(){
        return fournisseurService.findAll();
    }

    @Override
    public ResponseEntity<Map<String, Object>> modifyFournisseur(FournisseurDto dto, Integer id) {
        fournisseurService.modify(dto, id); // Appel à la couche service pour la mise à jour

        Map<String, Object> response = new HashMap<>();
        response.put("status", "200");
        response.put("message", "Fournisseur modifié avec succès !");
        return ResponseEntity.ok(response);
    }


    @Override
    public FournisseurDto findById(Integer id) {
        return fournisseurService.findById(id);
    }

    @Override
    public void delete(Integer id) {
        fournisseurService.delete(id);
    }
}

