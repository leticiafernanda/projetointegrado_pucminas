package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.dto.FichaAnimalDTO;
import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.entity.FichaAnimal;
import com.aplication.petcenter.domain.mapper.MapperAnimalDTO;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import com.aplication.petcenter.domain.mapper.MapperFichaAnimalDTO;
import com.aplication.petcenter.domain.mapper.MapperMedicoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperFichaAnimalDTOImpl implements MapperFichaAnimalDTO {

    private final MapperClienteDTO mapperClienteDTO;
    private final MapperMedicoDTO mapperMedicoDTO;
    private final MapperAnimalDTO mapperAnimalDTO;


    @Override
    public FichaAnimalDTO execute(FichaAnimal fichaAnimal) {
        return FichaAnimalDTO.builder()
                .id(fichaAnimal.getId())
                .proprietario(getProprietario(fichaAnimal))
                .animal(getAnimal(fichaAnimal))
                .medico(getMedico(fichaAnimal))
                .exames(fichaAnimal.getExames())
                .solicitaExames(fichaAnimal.getSolicitaExames())
                .procedimento(fichaAnimal.getProcedimento())
                .medicamentos(fichaAnimal.getMedicamentos())
                .data(fichaAnimal.getData())
                .build();
    }
    private ClienteDTO getProprietario(FichaAnimal fichaAnimal) {
        return fichaAnimal.getProprietario() != null
                ? mapperClienteDTO.execute(fichaAnimal.getProprietario())
                : null;
    }

    private MedicoDTO getMedico(FichaAnimal fichaAnimal) {
        return fichaAnimal.getProprietario() != null
                ? mapperMedicoDTO.execute(fichaAnimal.getMedico())
                : null;
    }
    private AnimalDTO getAnimal(FichaAnimal fichaAnimal) {
        return fichaAnimal.getAnimal() != null
                ? mapperAnimalDTO.execute(fichaAnimal.getAnimal())
                : null;
    }
}
