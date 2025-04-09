package com.example.gestion.repository;

import com.example.gestion.models.LigneAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneAchatRepository extends JpaRepository<LigneAchat, Integer> {
}
