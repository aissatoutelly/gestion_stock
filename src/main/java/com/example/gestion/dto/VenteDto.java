package com.example.gestion.dto;
import com.example.gestion.models.Client;
import com.example.gestion.models.Produit;
import com.example.gestion.models.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class VenteDto {
    private Integer id;
    private LocalDate dateVente;
    private Integer idProduit;
    private Integer idClient;
    private double total;

    public static VenteDto fromEntity (Vente vente){
        if (vente == null ){
            return null;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .dateVente(vente.getDateVente())
                .total(vente.getTotal())
                .idProduit(vente.getProduit() != null ? vente.getProduit().getId() : null)
                .idClient(vente.getClient() != null ? vente.getClient().getId() : null)

                .build();
    }

    public static Vente toEntity (VenteDto venteDto){
        if (venteDto == null){
            return null;
        }
        Vente vente = new Vente();
        vente.setId(venteDto.getId());
        vente.setDateVente(venteDto.getDateVente());
        vente.setTotal(venteDto.getTotal());

        if (venteDto.getIdProduit() != null){
            Produit produit = new Produit();
            produit.setId(venteDto.getIdProduit());
            vente.setProduit(produit);
        }

        if (venteDto.getIdClient() != null){
            Client client = new Client();
            client.setId(venteDto.getIdClient());
            vente.setClient(client);
        }
        return vente;

    }

}
