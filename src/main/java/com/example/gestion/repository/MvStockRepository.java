package com.example.gestion.repository;
import com.example.gestion.models.MvStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MvStockRepository extends JpaRepository <MvStock, Integer> {
}
