package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.FichaAnimalDTO;
import com.aplication.petcenter.service.FichaAnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/ficha")
@RequiredArgsConstructor
@Validated
public class FichaAnimalController {
    private final FichaAnimalService fichaAnimalService;

    @GetMapping
    public ResponseEntity<List<FichaAnimalDTO>> findFichaAnimalList() {
        List<FichaAnimalDTO> retorno = fichaAnimalService.findFichaAnimalList();
        return ResponseEntity.ok(retorno);
    }

}
