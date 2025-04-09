package com.example.gestion.dto;
import com.example.gestion.models.Client;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
    private Integer id;
    @NotBlank(message = "Le nom du client est obligatoire")
    @Size(min = 2, max = 255, message = "Le nom doit contenir entre 2 et 255 caractères")
    private  String nomClient;
    @NotBlank(message = "Le prénom du client est obligatoire")
    @Size(min = 2, max = 255, message = "Le prénom doit contenir entre 2 et 255 caractères")
    private String prenomClient;
    @NotBlank(message = "L'adresse du client est obligatoire")
    @Size(min = 5, max = 255, message = "L'adresse doit contenir entre 5 et 255 caractères")
    private String adressClient;
    @NotBlank(message = "Le téléphone du client est obligatoire")
    @Size(min = 8, max = 20, message = "Le numéro de téléphone doit contenir entre 8 et 20 caractères")
    private String telephoneClient;
    @NotBlank(message = "L'email du client est obligatoire")
    @Email(message = "L'email doit être valide")
    private String emailClient;

    public static ClientDto fromEntity (Client client){
        if(client == null){
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nomClient(client.getNomClient())
                .prenomClient(client.getPrenomClient())
                .adressClient(client.getAdressClient())
                .telephoneClient(client.getTelephoneClient())
                .emailClient(client.getEmailClient())
                .build();

    }
    public static Client toEntity(ClientDto clientDto) {
        if (clientDto == null) {
            return null;
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNomClient(clientDto.getNomClient());
        client.setPrenomClient(clientDto.getPrenomClient());
        client.setAdressClient(clientDto.getAdressClient());
        client.setTelephoneClient(clientDto.getTelephoneClient());
        client.setEmailClient(clientDto.getEmailClient());
        return client;
    }
}
