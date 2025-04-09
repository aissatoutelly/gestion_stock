package com.example.gestion.dto;
import com.example.gestion.models.Achat;
import com.example.gestion.models.Client;
import com.example.gestion.models.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class AchatDto {
    private Integer id;
    private LocalDate dateAchat;
    private Integer idfournisseur;
    private double total;

    public static AchatDto fromEntity (Achat achat) {
        if (achat == null) {
            return null;
        }
        return AchatDto.builder()
                .id(achat.getId())
                .dateAchat(achat.getDateAchat())
                .total(achat.getTotal())
                .idfournisseur(achat.getFournisseur() != null ? achat.getFournisseur().getId() : null)

                .build();
    }
    public static Achat toEntity (AchatDto achatDto){
        if (achatDto == null){
            return null;
        }
        Achat achat = new Achat();
        achat.setId(achat.getId());
        achat.setDateAchat(achat.getDateAchat());
        achat.setTotal(achat.getTotal());

        if (achatDto.getIdfournisseur() != null){
            Fournisseur fournisseur = new Fournisseur();
            fournisseur.setId(achatDto.getIdfournisseur());
            achat.setFournisseur(fournisseur);
        }
        return achat;
    }





}
