//package com.example.gestion.dto;
//import com.example.gestion.models.EntreeStock;
//import lombok.Builder;
//import lombok.Data;
//
//@Data
//@Builder
//public class EntreeStockDto {
//    private Integer id;
//    private String DateEntree;
//    private String quantite;
//
//    public static EntreeStockDto fromEntity (EntreeStock entreeStock){
//        if (entreeStock == null){
//            return null;
//        }
//        return EntreeStockDto.builder()
//                .id(entreeStock.getId())
//                .DateEntree(entreeStock.getDateEntree())
//                .quantite(entreeStock.getQuantite())
//                .build();
//    }
//    public static EntreeStock toEntity (EntreeStockDto dto){
//        if (dto == null) {
//            return null;
//        }
//        EntreeStock entreeStock = new EntreeStock();
//        entreeStock.setId(dto.getId());
//        entreeStock.setDateEntree(dto.getDateEntree());
//        entreeStock.setQuantite(dto.getQuantite());
//        return entreeStock;
//    }
//}
//
