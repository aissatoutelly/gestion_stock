package com.example.gestion.controller;
import com.example.gestion.controller.api.ProduitApi;
import com.example.gestion.dto.ProduitDto;
import com.example.gestion.services.ProduitService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Validated
public class ProduitController implements ProduitApi {
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    //@PostMapping("/create")
    @Override
    public ResponseEntity<Map<String, Object>> saveProduit(ProduitDto dto) {
        ProduitDto savedProduit = produitService.save(dto);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Produit ajouté avec succès !");
        response.put("status", "200");
        return ResponseEntity.ok(response);
    }

    @Override
    public ProduitDto findById(Integer id) {
        return produitService.findById(id);
    }

    @Override
    public ProduitDto modifyProduit(ProduitDto dto, Integer id) {
        return produitService.modify(dto, id);
    }

    @Override
    public void delete(Integer id) {
        produitService.delete(id);
    }

    @Override
    public List<ProduitDto> findAll() {
        return produitService.findAll();
    }

    @Override
    public List<ProduitDto> findByCategories(Integer idcategorie) {
        return produitService.findByCategories_Id(idcategorie);
    }

    @Override
    public List<ProduitDto> findByFournisseur(Integer idfournisseur) {
        return produitService.findByFournisseur_Id(idfournisseur);
    }
}