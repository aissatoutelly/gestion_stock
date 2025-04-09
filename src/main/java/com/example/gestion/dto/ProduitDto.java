package com.example.gestion.dto;
import com.example.gestion.models.Categories;
import com.example.gestion.models.Fournisseur;
import com.example.gestion.models.Produit;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data  //génère l'annotation
@Builder
public class ProduitDto {
    private Integer id;
    @NotBlank(message = "Le nom est obligatoire")
    @Size(min = 3, max = 255, message = "Le nom doit contenir entre 3 et 255 caractères")
    private String nomProduit;

    @NotBlank(message = "La description du produit est obligatoire")
    @Size(min = 3, max = 255, message = "La description ne doit pas dépasser 255 caractères")
    private String description;

    @Min(value = 0, message = "La quantité ne peut pas être négative")
    private Integer quantite;

    @NotNull(message = "Le prix est obligatoire")
    @Positive(message = "Le prix doit être > 0")
    private BigDecimal prix;

    @NotNull(message = "L'idcategorie est obligatoire")
    private Integer idcategorie;
    private String nomCategorie;

    @NotNull(message = "L'idfournisseur est obligatoire")
    private Integer idfournisseur;// Nouveau champ

    public static ProduitDto fromEntity(Produit produit) {
        if (produit == null) {
            return null;
        }
        return ProduitDto.builder()
                .id(produit.getId())
                .nomProduit(produit.getNomProduit())
                .description(produit.getDescription())
                .quantite(produit.getQuantite())
               .prix(produit.getPrix())
               .idcategorie(produit.getCategories() != null ? produit.getCategories().getId() : null)
                .nomCategorie(produit.getCategories() != null ? produit.getCategories().getNomCategories() : null)
                .idfournisseur(produit.getFournisseur() != null ? produit.getFournisseur().getId() : null)
                .build();
    }

    public static Produit toEntity(ProduitDto produitDto) {
        if (produitDto == null) {
            return null;
        }
        Produit produit = new Produit();
        produit.setId(produitDto.getId());
        produit.setNomProduit(produitDto.getNomProduit());
        produit.setDescription(produitDto.getDescription());
        produit.setQuantite(produitDto.getQuantite());
        produit.setPrix(produitDto.getPrix());

        if (produitDto.getIdcategorie() != null) {
            Categories categorie = new Categories();
            categorie.setId(produitDto.getIdcategorie());
            produit.setCategories(categorie);
        }
        if (produitDto.getIdfournisseur() != null){
            Fournisseur fournisseur = new Fournisseur();
            fournisseur.setId(produitDto.getIdfournisseur());
            produit.setFournisseur(fournisseur);
        }
        return produit;
    }
}
