package com.aplication.petcenter.service;

import java.util.List;

import com.aplication.petcenter.domain.dto.AnimalBasicDTO;
import com.aplication.petcenter.domain.dto.AnimalDTO;

public interface AnimalService {
    List<AnimalDTO> findAnimalList();

    AnimalDTO findById(Integer animalId);

    void deleteById(Integer animalId);

    void save(AnimalBasicDTO animal);


    AnimalDTO updateById(AnimalBasicDTO animalDTO, Integer animalId);
}
