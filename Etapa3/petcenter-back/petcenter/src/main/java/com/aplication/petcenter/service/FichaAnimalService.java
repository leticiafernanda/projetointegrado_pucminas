package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.FichaAnimalDTO;
import com.aplication.petcenter.domain.entity.FichaAnimal;

import java.util.List;

public interface FichaAnimalService {
    List<FichaAnimalDTO> findFichaAnimalList();

    void save(FichaAnimal fichaAnimal);
}
