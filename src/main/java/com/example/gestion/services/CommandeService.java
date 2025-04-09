package com.example.gestion.services;
import com.example.gestion.dto.CommandeDto;
import java.util.List;
public interface CommandeService {
    CommandeDto save(CommandeDto dto);
    // CommandeDto findById(Integer id);
    List<CommandeDto> findAll();
    //   void delete (Integer id);
     // CommandeDto modify(CommandeDto dto,Integer id);
}
