package com.aplication.petcenter.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.petcenter.domain.dto.AnimalBasicDTO;
import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.service.AnimalService;

import lombok.RequiredArgsConstructor;

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
    @GetMapping("/{id_animal}")
    public ResponseEntity<AnimalDTO> findOne(@PathVariable(value = "id_animal") Integer animalId) {
        return ResponseEntity.ok(animalService.findById(animalId));
    }
    @DeleteMapping("/{id_animal}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable(value = "id_animal") Integer animalId) {
        animalService.deleteById(animalId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Void> createAnimal(@RequestBody AnimalBasicDTO animal) {
        animalService.save(animal);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id_animal}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<AnimalDTO> updateAnimal(@PathVariable(value = "id_animal") Integer animalId,  @RequestBody AnimalBasicDTO animalDTO) {
        return ResponseEntity.ok(animalService.updateById(animalDTO, animalId));
    }
    }
