package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.AnimalDTO;

import java.util.List;

public interface AnimalService {
    List<AnimalDTO> findAnimalList();

    AnimalDTO findById(Integer clienteId);
}
