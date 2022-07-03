package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Animal;
import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.domain.mapper.MapperAnimalDTO;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import com.aplication.petcenter.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MapperAnimalDTOImpl implements MapperAnimalDTO {

    private final MapperClienteDTO mapperClienteDTO;
    private final ClienteRepository clienteRepository;
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


    public Animal execute(AnimalDTO animalDTO, Animal currentAnimal) {
        currentAnimal.setNome(animalDTO.getNome());
        currentAnimal.setEspecie(animalDTO.getEspecie());
        currentAnimal.setGenero(animalDTO.getGenero());
        currentAnimal.setIdade(animalDTO.getIdade());
        currentAnimal.setPelagem(animalDTO.getPelagem());
        currentAnimal.setPeso(animalDTO.getPeso());
        currentAnimal.setProprietario(getProprietarioAnimal (animalDTO.getProprietario().getId()).orElse(null));
        currentAnimal.setRaca(animalDTO.getRaca());
        return currentAnimal;
    }

    private ClienteDTO getProprietario(Animal animal) {
        return animal.getProprietario() != null
                ? mapperClienteDTO.execute(animal.getProprietario())
                : null;
    }
    private Optional<Cliente> getProprietarioAnimal(Integer id) {
        if(id != null) {
            return clienteRepository.findById(id);
        }
        return Optional.empty();
    }

}
