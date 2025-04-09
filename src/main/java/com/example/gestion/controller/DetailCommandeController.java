//package com.example.gestion.controller;
//import com.example.gestion.controller.api.DetailCommandeApi;
//import com.example.gestion.dto.DetailCommandeDto;
//import com.example.gestion.services.DetailCommandeService;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//@RestController
//public class DetailCommandeController implements DetailCommandeApi {
//    private final DetailCommandeService detailCommandeService;
//    public DetailCommandeController(DetailCommandeService detailCommandeService){
//        this.detailCommandeService = detailCommandeService;
//    }
//    @Override
//    public DetailCommandeDto saveDetailCommande (DetailCommandeDto dto){
//        return detailCommandeService.save(dto);
//    }
//    @Override
//    public List<DetailCommandeDto>findAll(){
//        return detailCommandeService.findAll();
//    }
//}
