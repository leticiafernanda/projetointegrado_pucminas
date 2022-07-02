package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id_animal}")
    public ResponseEntity<AnimalDTO> findOne(@PathVariable(value = "id_animal") Integer animalId) {
        return ResponseEntity.ok(animalService.findById(animalId));
    }
    @DeleteMapping("/{id_animal}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable(value = "id_animal") Integer animalId) {
        animalService.deleteById(animalId);
        return ResponseEntity.noContent().build();
    }

}
