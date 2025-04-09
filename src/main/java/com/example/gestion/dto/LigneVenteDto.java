package com.example.gestion.dto;
import com.example.gestion.models.LigneVente;
import com.example.gestion.models.Produit;
import com.example.gestion.models.Vente;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;
    private int quantite;
    private double prixUnitaire;
    private Integer idproduit;
    private Integer idvente;
    private double montantTotal;

    public static LigneVenteDto fromEntity (LigneVente ligneVente){
        if (ligneVente == null){
            return null;
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .montantTotal(ligneVente.getMontantTotal())
                .idproduit(ligneVente.getProduit() != null ? ligneVente.getProduit().getId() : null)
                .idvente(ligneVente.getVente() != null ? ligneVente.getVente().getId() : null)
                .build();
    }

    public static LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto == null){
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
        ligneVente.setMontantTotal(ligneVenteDto.getMontantTotal());

        if (ligneVenteDto.getIdproduit() != null){
            Produit produit = new Produit();
            produit.setId(ligneVenteDto.getIdproduit());
            ligneVente.setProduit(produit);
        }

        if (ligneVenteDto.getIdvente() != null){
            Vente vente = new Vente();
            vente.setId(ligneVenteDto.getIdvente());
            ligneVente.setVente(vente);
        }


        return ligneVente;
    }

}
