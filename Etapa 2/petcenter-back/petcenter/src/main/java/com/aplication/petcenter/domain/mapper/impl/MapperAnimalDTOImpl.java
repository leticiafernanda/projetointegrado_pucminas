package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Animal;
import com.aplication.petcenter.domain.mapper.MapperAnimalDTO;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperAnimalDTOImpl implements MapperAnimalDTO {

    private final MapperClienteDTO mapperClienteDTO;

    @Override
    public AnimalDTO execute(Animal animal) {
        return AnimalDTO.builder()
                .id(animal.getId())
                .nome(animal.getNome())
                .especie(animal.getEspecie())
                .genero(animal.getGenero())
                .idade(animal.getIdade())
                .pelagem(animal.getPelagem())
                .peso(animal.getPeso())
                .proprietario(getProprietario(animal))
                .raca(animal.getRaca())
                .build();

    }
    private ClienteDTO getProprietario(Animal animal) {
        return animal.getProprietario() != null
                ? mapperClienteDTO.execute(animal.getProprietario())
                : null;
    }

}
