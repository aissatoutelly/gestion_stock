//package com.example.gestion.controller;
//import com.example.gestion.controller.api.EntreeStockApi;
//import com.example.gestion.dto.ClientDto;
//import com.example.gestion.dto.EntreeStockDto;
//import com.example.gestion.models.EntreeStock;
//import com.example.gestion.services.ClientService;
//import com.example.gestion.services.EntreeStockService;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//@RestController
//public class EntreeStockController implements EntreeStockApi {
//    private final EntreeStockService entreeStockService;
//    public EntreeStockController(EntreeStockService entreeStockService){
//        this.entreeStockService = entreeStockService;
//    }
//    @Override
//    public EntreeStockDto saveEntreeStock(EntreeStockDto dto) {
//        return entreeStockService.save(dto);
//    }
//
//    @Override
//    public List<EntreeStockDto>findAll(){
//        return entreeStockService.findAll();
//    }
//}
