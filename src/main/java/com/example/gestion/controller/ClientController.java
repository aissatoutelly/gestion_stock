package com.example.gestion.controller;
import com.example.gestion.controller.api.ClientApi;
import com.example.gestion.dto.ClientDto;
import com.example.gestion.services.ClientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ClientController implements ClientApi {
    private final  ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }
    @Override
    public ResponseEntity<Map<String, Object>> saveClient(@Valid @RequestBody ClientDto dto) {
ClientDto savedClient = clientService.save(dto);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "200");
        response.put("message", "Client ajouté avec succès !");
        return ResponseEntity.ok(response);
    }

    @Override
    public List<ClientDto>findAll(){
        return clientService.findAll();
        }

    @Override
    public ResponseEntity<Map<String, Object>> modifyClient(ClientDto dto, Integer id) {
        clientService.modify(dto, id);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "200");
        response.put("message", "Client modifié avec succès !");
        return ResponseEntity.ok(response);
    }

    @Override
    public ClientDto findById(Integer id) {
        return clientService.findById(id);
    }

    @Override
    public void delete(Integer id) {
        clientService.delete(id);
    }
}

