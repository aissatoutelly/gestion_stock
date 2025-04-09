package com.example.gestion.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "achat")
public class Achat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate dateAchat;

    @ManyToOne
    @JoinColumn(name = "idfournisseur", nullable = false)
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "achat", cascade = CascadeType.ALL)
    private List<LigneAchat> lignesAchat = new ArrayList<>();


    private double total;

    @PrePersist
    @PreUpdate
    public void calculerTotal() {
        this.total = lignesAchat.stream()
                .mapToDouble(LigneAchat::getMontantTotal)
                .sum();
    }

    // Getters et Setters
}