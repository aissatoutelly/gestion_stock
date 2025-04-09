package com.example.gestion.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name = "Produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomProduit", unique = true, nullable = false)
    private String nomProduit;

    @Column(name = "quantite")
    private Integer quantite;


    @Column(name = "prix")
    private BigDecimal prix;


    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idcategorie")
    private Categories categories;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idfournisseur")
    private Fournisseur fournisseur;


    @ManyToMany(mappedBy = "produit")
    private List<Commande> commande;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.REMOVE)
    private List<MvStock> mvStock;

    @OneToMany(mappedBy = "produit")
    private List<Vente> vente;

    @OneToMany(mappedBy = "produit")
    private List<LigneVente> ligneVente;

    @OneToMany(mappedBy = "produit")
    private List<LigneAchat> ligneAchat;



//    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<DetailCommande> detailCommande;


}
