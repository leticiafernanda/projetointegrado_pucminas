package com.aplication.petcenter.domain.mapper.impl;

import org.springframework.stereotype.Component;

import com.aplication.petcenter.domain.dto.AnimalBasicDTO;
import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Animal;
import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.domain.mapper.MapperAnimalDTO;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;

import lombok.RequiredArgsConstructor;

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
    public Animal execute(AnimalBasicDTO animalDTO, Animal currentAnimal) {
        currentAnimal.setNome(animalDTO.getNome());
        currentAnimal.setEspecie(animalDTO.getEspecie());
        currentAnimal.setGenero(animalDTO.getGenero());
        currentAnimal.setIdade(animalDTO.getIdade());
        currentAnimal.setPelagem(animalDTO.getPelagem());
        currentAnimal.setPeso(animalDTO.getPeso());
        currentAnimal.setProprietario(getProprietarioId (animalDTO.getIdCliente()));
        currentAnimal.setRaca(animalDTO.getRaca());
        return currentAnimal;
    }
	public Animal execute(AnimalBasicDTO animal) {
		return Animal.builder()
                .id(animal.getId())
                .nome(animal.getNome())
                .especie(animal.getEspecie())
                .genero(animal.getGenero())
                .idade(animal.getIdade())
                .pelagem(animal.getPelagem())
                .peso(animal.getPeso())
                .proprietario(getProprietarioId(animal.getIdCliente()))
                .raca(animal.getRaca())
                .build();
	}
  
    private Cliente getProprietarioId(Integer idCliente) {
    	return Cliente.builder()
				.id(idCliente)
				.build();
	}
	private ClienteDTO getProprietario(Animal animal) {
        return animal.getProprietario() != null
                ? mapperClienteDTO.execute(animal.getProprietario())
                : null;
    }   
   
}
