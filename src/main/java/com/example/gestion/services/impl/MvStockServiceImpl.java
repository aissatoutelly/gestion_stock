package com.example.gestion.services.impl;
import com.example.gestion.Enum.TypeMouvement;
import com.example.gestion.dto.MvStockDto;
import com.example.gestion.exception.EntityNotFoundException;
import com.example.gestion.models.MvStock;
import com.example.gestion.models.Produit;
import com.example.gestion.repository.MvStockRepository;
import com.example.gestion.repository.ProduitRepository;
import com.example.gestion.services.MvStockService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MvStockServiceImpl implements MvStockService {
    private final MvStockRepository mvStockRepository;
    private final ProduitRepository produitRepository;

    public MvStockServiceImpl(MvStockRepository mvStockRepository, ProduitRepository produitRepository) {
        this.mvStockRepository = mvStockRepository;
        this.produitRepository = produitRepository;
    }



    @Override
    public MvStockDto save(Integer idProduit, Integer quantite, TypeMouvement typeMouvement) {
        Produit produit = produitRepository.findById(idProduit)
                .orElseThrow(() -> new EntityNotFoundException("Aucun produit trouvé avec ID: " + idProduit, "PRODUCT_NOT_FOUND"));

        if (typeMouvement == TypeMouvement.Entree) {
            produit.setQuantite(produit.getQuantite()  + quantite);
        } else if (typeMouvement == TypeMouvement.Sortie){
            if (produit.getQuantite() < quantite){
                throw new EntityNotFoundException("Stock insuffisant");
            }
            produit.setQuantite(produit.getQuantite() - quantite);
        }
        produitRepository.save(produit);

        MvStock mvStock = new MvStock();
        mvStock.setProduit(produit);
        mvStock.setQuantite(quantite);
        mvStock.setTypemouvement(typeMouvement);

        mvStock = mvStockRepository.save(mvStock);

        return MvStockDto.builder()
                .idproduit(mvStock.getProduit().getId())
                .quantite(mvStock.getQuantite())
                .typemouvement(mvStock.getTypemouvement())
                .build();
    }

    @Override
    public List<MvStockDto>findAll() {
        return mvStockRepository.findAll()
                .stream()
                .map(MvStockDto::fromEntity).collect(Collectors.toList());
    }


//    @Override
//    public MvStockDto findById(Integer id) {
//        return null;
//    }
//
//    @Override
//    public List<MvStockDto> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public void delete(Integer id) {
//    }
//
//    @Override
//    public MvStockDto modify(MvStockDto dto, Integer Id) {
//        return null;
//    }
}
