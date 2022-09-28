package com.aplication.petcenter.domain.mapper.impl;

import org.springframework.stereotype.Component;

import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.entity.Funcionario;
import com.aplication.petcenter.domain.entity.Medico;
import com.aplication.petcenter.domain.mapper.MapperMedicoDTO;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MapperMedicoDTOImpl implements MapperMedicoDTO {


    @Override
      public MedicoDTO execute(Medico medico) {
        return MedicoDTO.builder()
                .id(medico.getId())
                .nome(medico.getNome())
                .dataNascimento(medico.getDataNascimento())
                .email(medico.getEmail())
                .endereco(medico.getEndereco())
                .telefoneCasa(medico.getTelefoneCasa())
                .telefoneCelular(medico.getTelefoneCelular())
                .CRMV(medico.getCRMV())
                .build();
    }
  
}
