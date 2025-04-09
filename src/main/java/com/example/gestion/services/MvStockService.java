package com.example.gestion.services;
import com.example.gestion.Enum.TypeMouvement;
import com.example.gestion.dto.MvStockDto;

import java.util.List;

public interface MvStockService {
    MvStockDto save(Integer idProduit, Integer quantite, TypeMouvement typeMouvement);
    //MvStockDto findById(Integer id);
    List<MvStockDto>findAll();




//    Produit getProduitById(Integer id);

  //  void decreaseMvStock(Integer productId, int quantite);
    //void delete (Integer id);
    //MvStockDto modify(MvStockDto dto, Integer id);
}

