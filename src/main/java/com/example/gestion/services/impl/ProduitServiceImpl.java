package com.example.gestion.services.impl;
import com.example.gestion.Enum.TypeMouvement;
import com.example.gestion.dto.CategorieDto;
import com.example.gestion.dto.MvStockDto;
import com.example.gestion.dto.ProduitDto;
import com.example.gestion.exception.EntityNotFoundException;
import com.example.gestion.models.Categories;
import com.example.gestion.models.Produit;
import com.example.gestion.repository.ProduitRepository;
import com.example.gestion.services.ProduitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;
//    private  final CategorieRepository categorieRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
//        this.categorieRepository = categorieRepository;


    }

    @Override
    public ProduitDto save(ProduitDto dto) {
        Produit saveProduit = produitRepository.save(ProduitDto.toEntity(dto));
        return ProduitDto.fromEntity(saveProduit);
    }

    @Override
    public List<ProduitDto> findAll() {
        return produitRepository.findAll()
                .stream().
                map(ProduitDto::fromEntity)
                .collect(Collectors.toList());

    }

    @Override
    public ProduitDto modify(ProduitDto dto, Integer id) {
        return produitRepository.findById(id).map(
                produit -> {
                    produit.setNomProduit(dto.getNomProduit());
                    produit.setQuantite(dto.getQuantite());
                    produit.setDescription(dto.getDescription());
                    produit.setPrix(dto.getPrix());
                    Produit updatedProduit = produitRepository.save(produit);
                    return ProduitDto.fromEntity(updatedProduit);
                }
        ).orElseThrow(() -> new EntityNotFoundException("Produit not found with id: " + id));
    }

    @Override
    public ProduitDto findById(Integer id) {
        Optional<Produit> produit = produitRepository.findById(id);
        return produit.map(ProduitDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException("auncun produit avait cet ID est trouuvé"));
    }

    @Override
    public void delete(Integer id) {
        if (!produitRepository.existsById(id)) {
            throw new EntityNotFoundException("Produit avec l'ID " + id + " non trouvé !");
        }

        produitRepository.deleteById(id);
    }

    @Override
    public List<ProduitDto> findByCategories_Id(Integer idcategorie) {
        List<Produit> produits = produitRepository.findByCategories_Id(idcategorie);
        if (produits.isEmpty()) {
            throw new EntityNotFoundException("Aucun produit trouvé pour la catégorie ID: " + idcategorie);
        }
        return produits.stream().map(ProduitDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public List<ProduitDto> findByFournisseur_Id(Integer idfournisseur) {
        List<Produit> produit = produitRepository.findByFournisseur_Id(idfournisseur);
        if (produit.isEmpty()) {
            throw new EntityNotFoundException("Aucun produit trouvé pour le fournisseur ID: " + idfournisseur);
        }
        return produit.stream()
                .map(ProduitDto::fromEntity)
                .collect(Collectors.toList());
    }


}









