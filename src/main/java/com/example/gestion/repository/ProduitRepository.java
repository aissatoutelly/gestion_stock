package com.example.gestion.repository;
import com.example.gestion.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    // Trouver tous les produits d'une catégorie spécifique
    List<Produit> findByCategories_Id(Integer idcategorie);
    List<Produit> findByFournisseur_Id(Integer idFournisseur); // ← à ajouter
}
