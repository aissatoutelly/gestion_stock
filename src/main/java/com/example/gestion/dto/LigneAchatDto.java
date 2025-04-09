package com.example.gestion.dto;
import com.example.gestion.models.Achat;
import com.example.gestion.models.LigneAchat;
import com.example.gestion.models.Produit;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneAchatDto {
    private Integer id;
    private int quantite;
    private double prixUnitaire;
    private Integer idproduit;
    private Integer idachat;

//    private double montantTotal;

    public static LigneAchatDto fromEntity (LigneAchat ligneAchat){
        if (ligneAchat == null){
            return null;
        }
        return LigneAchatDto.builder()
                .id(ligneAchat.getId())
                .quantite(ligneAchat.getQuantite())
                .prixUnitaire(ligneAchat.getPrixUnitaire())
                .idproduit(ligneAchat.getProduit() != null ? ligneAchat.getProduit().getId() : null)
                .idachat(ligneAchat.getAchat() != null ? ligneAchat.getAchat().getId() : null)
//                .montantTotal(ligneAchat.getMontantTotal())
                .build();
    }

    public static LigneAchat toEntity (LigneAchatDto ligneAchatDto){
        if (ligneAchatDto == null) {
            return  null;
        }
        LigneAchat ligneAchat = new LigneAchat();
        ligneAchat.setId(ligneAchatDto.getId());
        ligneAchat.setQuantite(ligneAchatDto.getQuantite());
        ligneAchat.setPrixUnitaire(ligneAchatDto.getPrixUnitaire());

        if (ligneAchatDto.getIdproduit() != null){
            Produit produit = new Produit();
            produit.setId(ligneAchatDto.getIdproduit());
            ligneAchat.setProduit(produit);
        }
        if (ligneAchatDto.getIdachat() != null){
            Achat achat = new Achat();
            achat.setId(ligneAchatDto.getIdachat());
            ligneAchat.setAchat(achat);
        }
//        ligneAchat.setMontantTotal(ligneAchatDto.getMontantTotal());
        return ligneAchat;

    }

}
