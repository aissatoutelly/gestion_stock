package com.example.gestion.models;

import com.example.gestion.Enum.TypeMouvement;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name ="MvStock")
public class MvStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="date")
    private String date;
    @Column(name="quantite")
    private Integer quantite;
    @Column(name="description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idproduit")
    private Produit produit;


    @Enumerated(EnumType.STRING)  // Stocké en tant que texte dans la base de données
    @Column(name="typemouvement")
    private TypeMouvement typemouvement;
}
