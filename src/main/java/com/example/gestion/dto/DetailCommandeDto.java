//package com.example.gestion.dto;
//import com.example.gestion.models.DetailCommande;
//import lombok.Builder;
//import lombok.Data;
//
//
//@Data
//@Builder
//public class DetailCommandeDto {
//    private Integer id;
//    private String quantite;
//    private String prixUnitaire;
//
//    public static DetailCommandeDto fromEntity(DetailCommande detailCommande) {
//        if (detailCommande == null) {
//            return null;
//        }
//        return DetailCommandeDto.builder()
//                .id(detailCommande.getId())
//                .quantite(detailCommande.getQuantite())
//                .prixUnitaire(detailCommande.getPrixUnitaire())
//                .build();
//    }
//
//    public static DetailCommande toEntity(DetailCommandeDto dto) {
//        if (dto == null) {
//            return null;
//        }
//        DetailCommande detailCommande = new DetailCommande();
//        detailCommande.setId(dto.getId());
//        detailCommande.setQuantite(dto.getQuantite());
//        detailCommande.setPrixUnitaire(dto.getPrixUnitaire());
//        return detailCommande;
//    }
//
//}
//
