//package com.example.gestion.controller;
//import com.example.gestion.controller.api.SortieStockApi;
//import com.example.gestion.dto.SortieStockDto;
//import com.example.gestion.services.SortieStockService;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class SortieStockController implements SortieStockApi {
//    private final SortieStockService sortieStockService;
//
//    public SortieStockController(SortieStockService sortieStockService) {
//        this.sortieStockService = sortieStockService;
//    }
//
//    @Override
//    public SortieStockDto saveSortieStock(SortieStockDto dto) {
//        return sortieStockService.save(dto);
//    }
//
//    @Override
//    public List<SortieStockDto> findAll() {
//        return sortieStockService.findAll();
//    }
//}
