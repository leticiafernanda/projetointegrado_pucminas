package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.FichaAnimalDTO;
import com.aplication.petcenter.domain.entity.Agendamento;
import com.aplication.petcenter.domain.entity.FichaAnimal;
import com.aplication.petcenter.service.FichaAnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public ResponseEntity<Void> createFichaAnimal(@RequestBody FichaAnimal fichaAnimal) {
        fichaAnimalService.save(fichaAnimal);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
