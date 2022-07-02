package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.entity.Medico;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import com.aplication.petcenter.domain.mapper.MapperMedicoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperMedicoDTOImpl implements MapperMedicoDTO {

    private final MapperClienteDTO mapperClienteDTO;

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
