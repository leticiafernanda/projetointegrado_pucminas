package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.AdministradorDTO;
import com.aplication.petcenter.domain.entity.Administrador;
import com.aplication.petcenter.domain.mapper.MapperAdministradorDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperAdministradorDTOImpl implements MapperAdministradorDTO {

    @Override
    public AdministradorDTO execute(Administrador administrador) {
        return AdministradorDTO.builder()
                .id(administrador.getId())
                .nome(administrador.getNome())
                .telefoneCelular(administrador.getTelefoneCelular())
                .telefoneCasa(administrador.getTelefoneCasa())
                .emailCorporativo(administrador.getEmailCorporativo())
                .build();
    }
}
