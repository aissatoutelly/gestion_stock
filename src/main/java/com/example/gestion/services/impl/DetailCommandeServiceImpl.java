//package com.example.gestion.services.impl;
//import com.example.gestion.dto.DetailCommandeDto;
//import com.example.gestion.models.DetailCommande;
//import com.example.gestion.repository.DetailCommandeRepository;
//import com.example.gestion.services.DetailCommandeService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class DetailCommandeServiceImpl implements DetailCommandeService {
//    private final DetailCommandeRepository detailCommandeRepository;
//    public DetailCommandeServiceImpl (DetailCommandeRepository detailCommandeRepository){
//        this.detailCommandeRepository = detailCommandeRepository;
//    }
//    @Override
//    public DetailCommandeDto save(DetailCommandeDto dto) {
//        DetailCommande saveDetailCommande = detailCommandeRepository.save(DetailCommandeDto.toEntity(dto));
//        return DetailCommandeDto.fromEntity(saveDetailCommande);
//    }
//
//    @Override
//    public List<DetailCommandeDto> findAll(){
//        return detailCommandeRepository.findAll()
//                .stream()
//                .map(DetailCommandeDto::fromEntity).collect(Collectors.toList());
//    }
//
//    //@Override
//    //  public DetailCommandeDto findById(Integer id){
//    //    return null;
//    //}
//
//// @Override
//    //public List<DetailCommandeDto>findAll(){
//    //  return List.of();
//    //}
//
//    //   @Override
//    //   public void delete(Integer id){
//    //   }
//
//    //   @Override
//    //public DetailCommandeDto modify (DetailCommandeDto dto, Integer Id){
//    //  return null;
//    //}
//
//}