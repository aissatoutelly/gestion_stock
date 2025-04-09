package com.example.gestion.controller.api;
import com.example.gestion.Enum.TypeMouvement;
import com.example.gestion.dto.MvStockDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MvStockApi {
    @PostMapping(value = "/api/mvStock", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    MvStockDto saveMvStock(@RequestParam Integer idProduit,
                           @RequestParam Integer quantite,
                           @RequestParam TypeMouvement typeMouvement);

   @GetMapping(value = "/MvStock/list",produces = MediaType.APPLICATION_JSON_VALUE)
    List<MvStockDto>findAll();

}

