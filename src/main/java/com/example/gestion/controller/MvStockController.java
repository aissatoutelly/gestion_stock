package com.example.gestion.controller;
import com.example.gestion.Enum.TypeMouvement;
import com.example.gestion.controller.api.MvStockApi;
import com.example.gestion.dto.MvStockDto;
import com.example.gestion.services.MvStockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MvStockController implements MvStockApi {
    private final MvStockService mvStockService;

    public MvStockController(MvStockService mvStockService){
        this.mvStockService = mvStockService;
    }

    @Override
    public MvStockDto saveMvStock(Integer idProduit, Integer quantite, TypeMouvement typeMouvement) {
        return mvStockService.save(idProduit, quantite, typeMouvement);
    }

    @Override
    public List<MvStockDto> findAll() {
        return List.of();
    }


}
