package com.example.gestion.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "vente")
public class Vente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dateVente;

    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;

    @ManyToOne
    @JoinColumn(name="idproduit")
    private Produit produit;


    @OneToMany(mappedBy = "vente", cascade = CascadeType.ALL)
    private List<LigneVente> lignesVente = new ArrayList<>();

    private double total;

    @PrePersist
    @PreUpdate
    public void calculerTotal() {
        this.total = lignesVente.stream()
                .mapToDouble(LigneVente::getMontantTotal)
                .sum();
    }

    // Getters et Setters
}