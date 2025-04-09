package com.example.gestion.dto;
import com.example.gestion.models.Produit;
import com.example.gestion.models.Categories;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class CategorieDto {
private Integer id;
private String nomCategories;
private String description;
private List<ProduitDto> produits;

public static CategorieDto fromEntity(Categories categories) {
    if (categories == null) {
        return null;
    }
    return CategorieDto.builder()
            .id(categories.getId())
            .nomCategories(categories.getNomCategories())
            .description(categories.getDescription())
            .produits(categories.getProduits() != null
                    ? categories.getProduits().stream()
                    .map(ProduitDto::fromEntity)
                    .collect(Collectors.toList())
                    : null)
            .build();
}
public static Categories toEntity(CategorieDto categorieDto){
    if (categorieDto == null) {
        return null;
    }
    Categories categories =new Categories();
    categories.setId(categorieDto.getId());
    categories.setNomCategories(categorieDto.getNomCategories());
    categories.setDescription(categorieDto.getDescription());
    return categories;
}
}
