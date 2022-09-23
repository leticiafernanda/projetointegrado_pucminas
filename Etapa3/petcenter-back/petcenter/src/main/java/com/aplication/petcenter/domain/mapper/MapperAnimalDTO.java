package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.dto.AnimalBasicDTO;
import com.aplication.petcenter.domain.entity.Animal;

public interface MapperAnimalDTO {

    AnimalDTO execute(Animal animal);

    Animal execute(AnimalBasicDTO animalDTO, Animal currentAnimal);

    Animal execute(AnimalBasicDTO animal);
}
