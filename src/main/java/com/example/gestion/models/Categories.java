package com.example.gestion.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "Categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Le nom de la catégorie est obligatoire")
    @Size(min = 3, max = 255, message = "Le nom doit contenir entre 3 et 255 caractères")
    @Column(name = "nomCategories", unique = true, nullable = false)
    private String nomCategories;

    @Size(max = 255, message = "La description ne doit pas dépasser 255 caractères")
    @Column(name = "descriptions")
    private String description;


    @OneToMany(mappedBy =  "categories" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Produit> produits;
}
