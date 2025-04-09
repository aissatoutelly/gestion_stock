package com.example.gestion.controller;
import com.example.gestion.controller.api.CommandeApi;
import com.example.gestion.dto.CommandeDto;
import com.example.gestion.services.CommandeService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommandeController implements CommandeApi {

    private final CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @Override
    public CommandeDto saveCommande(CommandeDto dto) {
        return commandeService.save(dto);
    }

    @Override
    public List<CommandeDto> findAll() {
        return commandeService.findAll();
    }
}
