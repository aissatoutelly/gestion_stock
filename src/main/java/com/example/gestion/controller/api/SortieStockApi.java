//package com.example.gestion.controller.api;
//import com.example.gestion.dto.SortieStockDto;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import java.util.List;
//
//public interface SortieStockApi {
//    @PostMapping(value = "/SortieStock/create", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
//    SortieStockDto saveSortieStock(@RequestBody SortieStockDto dto);
//
//    @GetMapping(value ="/SortieStock/list",  produces = MediaType.APPLICATION_JSON_VALUE)
//    List<SortieStockDto> findAll();
//}
