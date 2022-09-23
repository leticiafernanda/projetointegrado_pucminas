package com.aplication.petcenter.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.petcenter.domain.dto.FichaAnimalDTO;
import com.aplication.petcenter.domain.entity.FichaAnimal;
import com.aplication.petcenter.service.FichaAnimalService;

import lombok.RequiredArgsConstructor;

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
    @PostMapping
    public ResponseEntity<Void> createFichaAnimal(@RequestBody FichaAnimal fichaAnimal) {
        fichaAnimalService.save(fichaAnimal);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
