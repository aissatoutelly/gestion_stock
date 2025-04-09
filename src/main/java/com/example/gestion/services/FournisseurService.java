package com.example.gestion.services;
import com.example.gestion.dto.FournisseurDto;

import java.util.List;
public interface FournisseurService {
    FournisseurDto save (FournisseurDto dto);
    FournisseurDto findById(Integer id);
    List<FournisseurDto>findAll();
    void delete (Integer id);
    FournisseurDto modify(FournisseurDto dto, Integer id);
}

