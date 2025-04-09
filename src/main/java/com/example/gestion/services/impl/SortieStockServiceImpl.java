//package com.example.gestion.services.impl;
//import com.example.gestion.dto.SortieStockDto;
//import com.example.gestion.models.SortieStock;
//import com.example.gestion.repository.SortieStockRepository;
//import com.example.gestion.services.SortieStockService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class SortieStockServiceImpl implements SortieStockService {
//    private final SortieStockRepository sortieStockRepository;
//    public SortieStockServiceImpl(SortieStockRepository sortieStockRepository){
//        this.sortieStockRepository=sortieStockRepository;
//    }
//    @Override
//    public SortieStockDto save (SortieStockDto dto){
//        SortieStock saveSortieStock = sortieStockRepository.save(SortieStockDto.toEntity(dto));
//        return SortieStockDto.fromEntity(saveSortieStock);
//    }
//    @Override
//    public List<SortieStockDto> findAll(){
//        return sortieStockRepository.findAll()
//                .stream()
//                .map(SortieStockDto::fromEntity).collect(Collectors.toList());
//    }
//
//    }
//
