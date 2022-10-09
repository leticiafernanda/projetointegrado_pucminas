package com.aplication.petcenter.domain.mapper.impl;

import org.springframework.stereotype.Component;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Usuario;
import com.aplication.petcenter.domain.entity.Enum.TipoPermissão;
import com.aplication.petcenter.domain.mapper.MapperUsuarioDTO;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MapperUsuarioDTOImpl implements MapperUsuarioDTO {  
	@Override
	public Usuario execute(UsuarioDTO usuario) {
		   return Usuario.builder()
	                .id(usuario.getId())
	                .email(usuario.getEmail())
	                .senha(usuario.getSenha())
	                .tipo(getTipo(usuario.getTipo()))
	                .build();
	}

	private TipoPermissão getTipo(Integer tipo) {
		TipoPermissão x = TipoPermissão.toEnum(tipo);
		return x;
	}
}
