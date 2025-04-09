package com.example.gestion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name ="Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Le nom du client est obligatoire")
    @Size(min = 2, max = 255, message = "Le nom doit contenir entre 2 et 255 caractères")
    @Column(name= "nomClient")
    private String nomClient;
    @NotBlank(message = "Le prénom du client est obligatoire")
    @Size(min = 2, max = 255, message = "Le prénom doit contenir entre 2 et 255 caractères")
    @Column(name="prenomClient")
    private String prenomClient;
    @NotBlank(message = "L'adresse du client est obligatoire")
    @Size(min = 5, max = 255, message = "L'adresse doit contenir entre 5 et 255 caractères")
    @Column(name="adressClient")
    private String adressClient;
    @NotBlank(message = "Le téléphone du client est obligatoire")
    @Size(min = 8, max = 20, message = "Le numéro de téléphone doit contenir entre 8 et 20 caractères")
    @Column(name="telephoneClient")
    private String telephoneClient;
    @NotBlank(message = "L'email du client est obligatoire")
    @Email(message = "L'email doit être valide")
    @Column(name="emailClient")
    private String emailClient;

    @OneToMany(mappedBy ="client" )
    private List<Commande>commande;

    @OneToMany(mappedBy = "client")
    private List<Vente> vente;

}
