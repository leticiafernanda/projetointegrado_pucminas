package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.entity.Animal;

import java.util.List;

public interface AnimalService {
    List<AnimalDTO> findAnimalList();

    AnimalDTO findById(Integer animalId);

    void deleteById(Integer animalId);

    void save(Animal animal);


    AnimalDTO updateById(AnimalDTO animalDTO, Integer animalId);
}
