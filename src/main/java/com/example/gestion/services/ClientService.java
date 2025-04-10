package com.example.gestion.services;
import com.example.gestion.dto.ClientDto;

import java.util.List;
public interface ClientService {
    ClientDto save (ClientDto dto);
    ClientDto findById(Integer id);
    List<ClientDto>findAll();
    void delete (Integer id);
    ClientDto modify(ClientDto dto, Integer id);
}
