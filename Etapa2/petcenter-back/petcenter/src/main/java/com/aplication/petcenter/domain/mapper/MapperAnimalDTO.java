package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.entity.Animal;

public interface MapperAnimalDTO {

    AnimalDTO execute(Animal animal);

}
