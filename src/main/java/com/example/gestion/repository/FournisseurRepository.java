package com.example.gestion.repository;
import com.example.gestion.models.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer>{
}
