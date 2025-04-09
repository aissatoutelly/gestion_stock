package com.example.gestion.repository;
import com.example.gestion.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer> {
}
