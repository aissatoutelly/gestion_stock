package com.example.gestion.services;

import com.example.gestion.dto.CategorieDto;

import java.util.List;

public interface CategorieService {
    CategorieDto save(CategorieDto dto);
    List<CategorieDto> findAll();
     void delete (Integer id);
    CategorieDto findById(Integer id);
    CategorieDto modify(CategorieDto dto, Integer id);


}

