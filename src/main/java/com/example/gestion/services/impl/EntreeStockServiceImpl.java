//package com.example.gestion.services.impl;
//import com.example.gestion.dto.EntreeStockDto;
//import com.example.gestion.models.EntreeStock;
//import com.example.gestion.repository.EntreeStockRepository;
//import com.example.gestion.services.EntreeStockService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class EntreeStockServiceImpl implements  EntreeStockService {
//    private final EntreeStockRepository entreeStockRepository;
//    public EntreeStockServiceImpl(EntreeStockRepository entreeStockRepository){
//        this.entreeStockRepository=entreeStockRepository;
//    }
//    @Override
//    public EntreeStockDto save(EntreeStockDto dto){
//        EntreeStock saveEntreeStock = entreeStockRepository.save(EntreeStockDto.toEntity(dto));
//        return EntreeStockDto.fromEntity(saveEntreeStock);
//    }
//
//    @Override
//    public List<EntreeStockDto> findAll(){
//        return entreeStockRepository.findAll()
//                .stream()
//                .map(EntreeStockDto::fromEntity).collect(Collectors.toList());
//    }
////    @Override
////    public EntreeStockDto findById(Integer id){
////        return null;
////    }
////    @Override
////    public List<EntreeStockDto>findAll(){
////        return List.of();
////    }
////    @Override
////    public void delete(Integer id){
////
////    }
////    @Override
////    public EntreeStockDto modify (EntreeStockDto dto, Integer id){
////        return null;
////    }
//}
