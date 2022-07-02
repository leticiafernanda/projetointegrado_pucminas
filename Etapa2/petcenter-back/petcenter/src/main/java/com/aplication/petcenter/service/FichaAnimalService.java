package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.FichaAnimalDTO;

import java.util.List;

public interface FichaAnimalService {
    List<FichaAnimalDTO> findFichaAnimalList();
}
