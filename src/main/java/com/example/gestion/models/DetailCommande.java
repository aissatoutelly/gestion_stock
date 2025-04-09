//package com.example.gestion.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Entity
//@Data
//@Table(name = "DetailCommande")
//public class DetailCommande {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    @Column(name= "quantite")
//    private String Quantite;
//    @Column(name="prixUnitaire")
//    private String prixUnitaire;
//
////    @ManyToMany(mappedBy = "produit") // Relation bidirectionnelle
////    private List<Commande> commande;
////    @ManyToOne
////    @JoinColumn(name = "idcommande")
////    private Commande commande;
////
////    @ManyToOne
////    @JoinColumn(name = "idProduit")
////    private Produit Produit;
////
////    @Column(name = "quantite")
////    private String quantite;
////
////    @Column(name = "prixunitaire")
////    private String prixunitaire;
//}
