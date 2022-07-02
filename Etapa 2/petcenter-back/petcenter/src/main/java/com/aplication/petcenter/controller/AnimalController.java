package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/animal")
@RequiredArgsConstructor
@Validated
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<AnimalDTO>> findAnimalList() {
        List<AnimalDTO> retorno = animalService.findAnimalList();
        return ResponseEntity.ok(retorno);
    }
    @GetMapping("/{id_cliente}")
    public ResponseEntity<AnimalDTO> findOne(@PathVariable(value = "id_cliente") Integer clienteId) {
        return ResponseEntity.ok(animalService.findById(clienteId));
    }

}
