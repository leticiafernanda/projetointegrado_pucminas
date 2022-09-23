package com.aplication.petcenter.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.aplication.petcenter.domain.dto.AnimalBasicDTO;
import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.entity.Animal;
import com.aplication.petcenter.domain.mapper.MapperAnimalDTO;
import com.aplication.petcenter.repository.AnimalRepository;
import com.aplication.petcenter.service.AnimalService;

import lombok.RequiredArgsConstructor;
import lombok.var;

@Service
@RequiredArgsConstructor
@Transactional
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;
    private final MapperAnimalDTO mapperAnimalDTO;

    @Override
    public List<AnimalDTO> findAnimalList() {
        List<Animal> animal = animalRepository.findAll();
        return animal.stream().map(mapperAnimalDTO::execute).collect(Collectors.toList());
    }

    @Override
    public AnimalDTO findById(Integer animalId) {
        var animal = animalRepository.findById(animalId).orElse(null);
        return mapperAnimalDTO.execute(animal);
    }

    @Override
    public void deleteById(Integer animalId) {
         animalRepository.deleteById(animalId);
    }

    @Transactional
    public void save(AnimalBasicDTO animal) {
        var createAnimal = mapperAnimalDTO.execute(animal);
        animalRepository.save(createAnimal);
    }

    @Override
    public AnimalDTO updateById(AnimalBasicDTO animalDTO, Integer animalId) {
        var currentAnimal = animalRepository.findById(animalId).orElse(null);
        animalDTO.setId(animalId);
        Animal animal = mapperAnimalDTO.execute(animalDTO, currentAnimal);
        animalRepository.save(animal);
        return mapperAnimalDTO.execute(animal);
    }
}
