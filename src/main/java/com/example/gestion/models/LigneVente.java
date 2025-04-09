package com.example.gestion.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ligne_vente")
public class LigneVente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idvente", nullable = false)
    private Vente vente;

    @ManyToOne
    @JoinColumn(name = "idproduit")
    private Produit produit;

    private int quantite;
    private double prixUnitaire;
    private double montantTotal;

    @PrePersist
    @PreUpdate
    public void calculerMontantTotal() {
        this.montantTotal = this.quantite * this.prixUnitaire;
    }

    // Getters et Setters
}