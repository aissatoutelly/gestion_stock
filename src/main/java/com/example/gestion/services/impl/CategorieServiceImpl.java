package com.example.gestion.services.impl;

import com.example.gestion.dto.CategorieDto;
import com.example.gestion.exception.EntityNotFoundException;
import com.example.gestion.models.Categories;

import com.example.gestion.repository.CategorieRepository;
import com.example.gestion.services.CategorieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository){
        this.categorieRepository = categorieRepository;

    }

    @Override
    public CategorieDto save(CategorieDto dto) {
        Categories saveCategorie = categorieRepository.save(CategorieDto.toEntity(dto));
        return CategorieDto.fromEntity(saveCategorie);
    }

    @Override
    public List<CategorieDto> findAll() {
        return categorieRepository.findAll()
                .stream()
                .map(CategorieDto::fromEntity).collect(Collectors.toList());

    }

    @Override
    public CategorieDto findById(Integer id) {
        Optional<Categories> categorie = categorieRepository.findById(id);
        return categorie.map(CategorieDto::fromEntity)
                .orElseThrow(() -> new EntityNotFoundException("aucune categorie avec cest ID est trouvé"));
    }

    @Override
    public CategorieDto modify(CategorieDto dto, Integer id) {
        return categorieRepository.findById(id).map(
                categories -> {
                    categories.setNomCategories(dto.getNomCategories());
                    categories.setDescription(dto.getDescription());

                    // Sauvegarder la catégorie mise à jour
                    Categories updatedCategorie = categorieRepository.save(categories);

                    // Retourner le DTO correspondant à la catégorie mise à jour
                    return CategorieDto.fromEntity(updatedCategorie);
                }
        ).orElseThrow(() -> new EntityNotFoundException("Catégorie non trouvée avec l'ID : " + id));
    }

    @Override
    public void delete(Integer id) {
        if (!categorieRepository.existsById(id)) {
            throw new EntityNotFoundException("aucune Categorie avec l'ID " + id + " non trouvé !");
        }

        categorieRepository.deleteById(id);
    }



}










