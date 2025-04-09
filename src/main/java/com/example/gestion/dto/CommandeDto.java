package com.example.gestion.dto;
import com.example.gestion.models.*;
import com.example.gestion.models.Commande;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeDto {
    private Integer id;
    private String DatedeCommande;

    public static CommandeDto fromEntity (Commande commande) {
        if (commande == null) {
            return null;
        }
        return CommandeDto.builder()
                .id(commande.getId())
                .DatedeCommande(commande.getDatedeCommande())
                .build();

    }
    public static Commande toEntity(CommandeDto commandeDto) {
        if (commandeDto == null) {
            return null; // Si le DTO est nul, on retourne null
        }

        Commande commande = new Commande(); // On crée toujours un nouvel objet Commande
        if (commandeDto.getId() != null) {
            commande.setId(commandeDto.getId()); // Si l'ID n'est pas nul, on le définit
        }
        commande.setDatedeCommande(commandeDto.getDatedeCommande()); // On définit la date de commande

        return commande; // On retourne l'objet Commande
    }


}

