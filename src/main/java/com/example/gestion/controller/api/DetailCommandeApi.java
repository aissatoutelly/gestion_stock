//package com.example.gestion.controller.api;
//import com.example.gestion.dto.DetailCommandeDto;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//public interface DetailCommandeApi {
//    @PostMapping(value = "/detailCommande/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    DetailCommandeDto saveDetailCommande(@RequestBody DetailCommandeDto dto);
//
//    @GetMapping(value ="/detailCommande/list", produces = MediaType.APPLICATION_JSON_VALUE)
//    List<DetailCommandeDto> findAll();
//}
//
//
