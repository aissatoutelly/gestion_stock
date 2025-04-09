package com.example.gestion.dto;
import com.example.gestion.Enum.TypeMouvement;
import com.example.gestion.models.MvStock;

import com.example.gestion.models.Produit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor // Cela génère un constructeur public avec tous les arguments
public class MvStockDto {
    private Integer id;
    private String date;
    private Integer quantite;
    private String description;
    private Integer idproduit;
    private String nomproduit;
    private TypeMouvement typemouvement;

    public static MvStockDto fromEntity(MvStock mvStock) {

        if (mvStock == null) {
            return null;
        }
        return MvStockDto.builder()
                .id(mvStock.getId())
                .date(mvStock.getDate())
                .quantite(mvStock.getQuantite())
                .description(mvStock.getDescription())
                .typemouvement(mvStock.getTypemouvement())
                .idproduit(mvStock.getProduit() != null? mvStock.getProduit().getId():null)
                .nomproduit(mvStock.getProduit() != null? mvStock.getProduit().getNomProduit():null)
                .build();
    }

    public static MvStock toEntity(MvStockDto mvStockDto) {
        if (mvStockDto == null) {
            return null;
        }
        MvStock mvStock = new MvStock();
        mvStock.setId(mvStockDto.getId());
        mvStock.setDate(mvStockDto.getDate());
        mvStock.setQuantite(mvStockDto.getQuantite());
        mvStock.setDescription(mvStockDto.getDescription());
        mvStock.setTypemouvement(mvStockDto.getTypemouvement());

        if (mvStockDto.getIdproduit() != null) {
            Produit produit = new Produit();
            produit.setId(mvStockDto.getIdproduit());
            mvStock.setProduit(produit);
        }
        return mvStock;
    }
}
