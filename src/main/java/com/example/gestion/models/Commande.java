package com.example.gestion.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "DatedeCommande")
    private String DatedeCommande;

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "commande_produit",
            joinColumns = @JoinColumn(name = "idcommande"),
            inverseJoinColumns = @JoinColumn(name = "idproduit")
    )
    private List<Produit> produit;

}
