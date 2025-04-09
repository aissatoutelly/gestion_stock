package com.example.gestion.services.impl;
import com.example.gestion.dto.CategorieDto;
import com.example.gestion.dto.ClientDto;
import com.example.gestion.exception.EntityNotFoundException;
import com.example.gestion.models.Categories;
import com.example.gestion.models.Client;
import com.example.gestion.repository.ClientRepository;
import com.example.gestion.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDto save(ClientDto dto) {
        Client saveClient = clientRepository.save(ClientDto.toEntity(dto));
        return ClientDto.fromEntity(saveClient);
    }

    @Override
    public ClientDto findById(Integer id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.map(ClientDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException("aucun client avec cest ID est trouvé"));
    }

    @Override
    public List<ClientDto> findAll() {
        return clientRepository.findAll()
                .stream()
                .map(ClientDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if (!clientRepository.existsById(id)) {
            throw new EntityNotFoundException("aucun Client avec l'ID " + id + " non trouvé !");
        }
    }

    @Override
    public ClientDto modify(ClientDto dto, Integer id) {
        // Rechercher le client par son ID
        Client clientToUpdate = clientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aucun client trouvé avec l'ID : " + id));

        // Mettre à jour les informations du client avec les nouvelles données du DTO
        clientToUpdate.setNomClient(dto.getNomClient());
        clientToUpdate.setPrenomClient(dto.getPrenomClient());
        clientToUpdate.setAdressClient(dto.getAdressClient());
        clientToUpdate.setTelephoneClient(dto.getTelephoneClient());
        clientToUpdate.setEmailClient(dto.getEmailClient());

        // Sauvegarder le client modifié
        Client updatedClient = clientRepository.save(clientToUpdate);

        // Retourner le DTO du client modifié
        return ClientDto.fromEntity(updatedClient);
    }

}
