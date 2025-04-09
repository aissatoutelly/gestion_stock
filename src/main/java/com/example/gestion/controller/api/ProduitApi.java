package com.example.gestion.controller.api;
import com.example.gestion.Enum.TypeMouvement;
import com.example.gestion.dto.MvStockDto;
import com.example.gestion.dto.ProduitDto;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

public interface ProduitApi {

    @PostMapping(value = "/produit/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Map<String, Object>> saveProduit(@Valid @RequestBody ProduitDto dto);

    @GetMapping(value = "/produit/{idproduit}", produces = MediaType.APPLICATION_JSON_VALUE)
    ProduitDto findById(@Valid@PathVariable("idproduit") Integer id);

    @PutMapping(value = "/produit/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ProduitDto modifyProduit(@Valid @RequestBody ProduitDto dto, @PathVariable Integer id);

    @DeleteMapping(value = "/produit/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    void delete(@PathVariable Integer id);

    @GetMapping(value = "/produit/list", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProduitDto> findAll();

    @GetMapping(value = "/produit/categorie/{idcategorie}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProduitDto> findByCategories(@PathVariable Integer idcategorie);

    @GetMapping(value = "/produit/fournisseur/{idfournisseur}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ProduitDto> findByFournisseur(@PathVariable Integer idfournisseur);
}
