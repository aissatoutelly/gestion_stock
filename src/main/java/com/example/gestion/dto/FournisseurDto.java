package com.example.gestion.dto;
import com.example.gestion.models.Fournisseur;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDto {
    private Integer id;


    @NotBlank(message = "Le nom du fournisseur est obligatoire")
    @Size(max = 255, message = "Le nom ne doit pas dépasser 255 caractères")
    private  String nomFournisseur;


    @NotBlank(message = "Le prénom du fournisseur est obligatoire")
    @Size(max = 255, message = "Le prénom ne doit pas dépasser 255 caractères")
    private String prenomFournisseur;


    @NotBlank(message = "L'adresse est obligatoire")
    @Size(max = 255, message = "L'adresse ne doit pas dépasser 255 caractères")
    private String adressFournisseur;

    @NotBlank(message = "Le téléphone est obligatoire")
    @Pattern(regexp = "^[0-9]{8,15}$", message = "Le numéro de téléphone doit contenir entre 8 et 15 chiffres")
    private String telephoneFournisseur;


    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "L'email doit être valide")
    private String emailFournisseur;


    public static FournisseurDto fromEntity (Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nomFournisseur(fournisseur.getNomFournisseur())
                .prenomFournisseur(fournisseur.getPrenomFournisseur())
                .adressFournisseur(fournisseur.getAdressFournisseur())
                .telephoneFournisseur(fournisseur.getTelephoneFournisseur())
                .emailFournisseur(fournisseur.getEmailFournisseur())
                .build();

    }
    public static Fournisseur toEntity(FournisseurDto fournisseurDto) {
        if (fournisseurDto == null) {
            return null;
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNomFournisseur(fournisseurDto.getNomFournisseur());
        fournisseur.setPrenomFournisseur(fournisseurDto.getPrenomFournisseur());
        fournisseur.setAdressFournisseur(fournisseurDto.getAdressFournisseur());
        fournisseur.setTelephoneFournisseur(fournisseurDto.getTelephoneFournisseur());
        fournisseur.setEmailFournisseur(fournisseurDto.getEmailFournisseur());
        return fournisseur;
    }
}

