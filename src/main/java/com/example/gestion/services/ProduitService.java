package com.example.gestion.services;

import com.example.gestion.dto.ProduitDto;

import java.util.List;

public interface ProduitService {
    ProduitDto save(ProduitDto produitDto);
    List<ProduitDto> findAll();
     ProduitDto modify(ProduitDto dto,Integer id);
    ProduitDto findById(Integer id);
     void delete(Integer id);
    List<ProduitDto> findByCategories_Id(Integer idcategorie);
    List<ProduitDto> findByFournisseur_Id(Integer idfournisseur);  // Nouvelle méthode ajoutée
}











