package com.example.gestion.models;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name ="Fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Le nom du fournisseur est obligatoire")
    @Size(max = 255, message = "Le nom doit pas dépasser 255 caractères")
    @Column(name= "nomFournisseur", nullable = false, length = 255)
    private String nomFournisseur;

    @NotBlank(message = "Le prénom du fournisseur est obligatoire")
    @Size(max = 255, message = "Le prénom ne doit pas dépasser 255 caractères")
    @Column(name="prenomFournisseur", nullable = false, length = 255)
    private String prenomFournisseur;

    @NotBlank(message = "L'adresse est obligatoire")
    @Size(max = 255, message = "L'adresse ne doit pas dépasser 255 caractères")
    @Column(name="adressFournisseur", nullable = false, length = 255)
    private String adressFournisseur;

    @NotBlank(message = "Le téléphone est obligatoire")
    @Pattern(regexp = "^[0-9]{8,15}$", message = "Le numéro de téléphone doit contenir entre 8 et 15 chiffres")
    @Column(name="telephoneFournisseur", nullable = false, length = 15)
    private String telephoneFournisseur;


    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "L'email doit être valide")
    @Column(name="emailFournisseur", nullable = false, unique = true)
    private String emailFournisseur;

    @OneToMany(mappedBy =  "fournisseur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produit> produits;

    @OneToMany(mappedBy = "fournisseur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Achat> achat;
}
