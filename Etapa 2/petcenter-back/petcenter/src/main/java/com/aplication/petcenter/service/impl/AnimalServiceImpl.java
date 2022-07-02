package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.entity.Animal;
import com.aplication.petcenter.domain.mapper.MapperAnimalDTO;
import com.aplication.petcenter.repository.AnimalRepository;
import com.aplication.petcenter.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;
    private final MapperAnimalDTO mapperAnimalDTO;

    @Override
    public List<AnimalDTO> findAnimalList() {
        List<Animal> animal = animalRepository.findAll();
        return animal.stream().map(mapperAnimalDTO::execute).collect(Collectors.toList());
    }
}
