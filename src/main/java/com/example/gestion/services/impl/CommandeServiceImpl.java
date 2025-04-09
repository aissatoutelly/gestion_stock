package com.example.gestion.services.impl;
import com.example.gestion.dto.CommandeDto;
import com.example.gestion.models.Commande;
import com.example.gestion.repository.CommandeRepository;
import com.example.gestion.services.CommandeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandeServiceImpl implements CommandeService {
    private final CommandeRepository commandeRepository;

    public CommandeServiceImpl(CommandeRepository commandeRepository){
        this.commandeRepository = commandeRepository;
    }
    @Override
    public CommandeDto save(CommandeDto dto) {
        Commande saveCommande = commandeRepository.save(CommandeDto.toEntity(dto));
        return CommandeDto.fromEntity(saveCommande);
    }

    @Override
    public List<CommandeDto>findAll(){
        return commandeRepository.findAll().stream()
                .map(CommandeDto::fromEntity).collect(Collectors.toList());
    }

}
