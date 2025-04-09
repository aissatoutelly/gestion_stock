//package com.example.gestion.dto;
//import com.example.gestion.models.EntreeStock;
//import com.example.gestion.models.SortieStock;
//import lombok.Builder;
//import lombok.Data;
//
//@Data
//@Builder
//public class SortieStockDto {
//    private Integer id;
//    private String DateSortie;
//    private String quantite;
//
//    public static SortieStockDto fromEntity (SortieStock sortieStock){
//        if (sortieStock== null){
//            return null;
//        }
//        return SortieStockDto.builder()
//                .id(sortieStock.getId())
//                .DateSortie(sortieStock.getDateSortie())
//                .quantite(sortieStock.getQuantite())
//                .build();
//    }
//    public static SortieStock toEntity(SortieStockDto dto){
//        if (dto == null) {
//            return null;
//        }
//        SortieStock sortieStock = new SortieStock();
//        sortieStock.setId(dto.getId());
//        sortieStock.setDateSortie(dto.getDateSortie());
//        sortieStock.setQuantite(dto.getQuantite());
//        return sortieStock;
//    }
//    }
//
