package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Usuario;
import com.aplication.petcenter.domain.mapper.MapperUsuarioDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperUsuarioDTOImpl implements MapperUsuarioDTO {
    @Override
    public UsuarioDTO execute(Usuario usuario) {

        return UsuarioDTO.builder()
                .id(usuario.getId())
                .email(usuario.getEmail())
                .senha(usuario.getSenha())
                .tipo(usuario.getTipo())
                .build();
    }
}
