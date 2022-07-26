package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.FichaAnimalDTO;
import com.aplication.petcenter.domain.entity.FichaAnimal;

public interface MapperFichaAnimalDTO {

    FichaAnimalDTO execute(FichaAnimal fichaAnimal);

}
