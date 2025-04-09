package com.example.gestion.repository;

import com.example.gestion.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository <Categories, Integer>{

}
