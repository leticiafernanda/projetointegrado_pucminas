package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.FichaAnimalDTO;
import com.aplication.petcenter.domain.entity.FichaAnimal;
import com.aplication.petcenter.domain.mapper.MapperFichaAnimalDTO;
import com.aplication.petcenter.repository.FichaAnimalRepository;
import com.aplication.petcenter.service.FichaAnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FichaAnimalServiceImpl implements FichaAnimalService {

    private final FichaAnimalRepository fichaAnimalRepository;
    private final MapperFichaAnimalDTO mapperFichaAnimalDTO;

    @Override
    public List<FichaAnimalDTO> findFichaAnimalList() {
        List<FichaAnimal> fichaAnimal = fichaAnimalRepository.findAll();
        return fichaAnimal.stream().map(mapperFichaAnimalDTO::execute).collect(Collectors.toList());
    }

    @Override
    public void save(FichaAnimal fichaAnimal) {
        fichaAnimalRepository.save(fichaAnimal);
    }
}
