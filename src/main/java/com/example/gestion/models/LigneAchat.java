package com.example.gestion.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ligne_achat")
public class LigneAchat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idachat", nullable = false)
    private Achat achat;

    @ManyToOne
    @JoinColumn(name = "idproduit", nullable = false)
    private Produit produit;

    private int quantite;
    private double prixUnitaire;
    private double montantTotal;

    public double getMontantTotal() {
        return prixUnitaire * quantite;
    }


    @PrePersist
    @PreUpdate
    public void calculerMontantTotal() {
        this.montantTotal = this.quantite * this.prixUnitaire;
    }
}