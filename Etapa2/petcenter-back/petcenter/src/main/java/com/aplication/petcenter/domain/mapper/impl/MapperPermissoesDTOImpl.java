package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.PermissoesDTO;
import com.aplication.petcenter.domain.entity.Permissoes;
import com.aplication.petcenter.domain.mapper.MapperPermissoesDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperPermissoesDTOImpl implements MapperPermissoesDTO {


    @Override
    public PermissoesDTO execute(Permissoes permissoes) {
        return PermissoesDTO.builder()
                .id(permissoes.getId())
                .tipo(permissoes.getTipo())
                .build();
    }
}
