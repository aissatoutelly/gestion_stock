//package com.example.gestion.controller.api;
//import com.example.gestion.dto.ClientDto;
//import com.example.gestion.dto.EntreeStockDto;
//import com.example.gestion.models.EntreeStock;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//public interface EntreeStockApi {
//    @PostMapping(value = "/EntreeStock/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    EntreeStockDto saveEntreeStock(@RequestBody EntreeStockDto dto);
//
//    @GetMapping(value="/EntreeStock/list", produces = MediaType.APPLICATION_JSON_VALUE)
//    List<EntreeStockDto>findAll();
//}
