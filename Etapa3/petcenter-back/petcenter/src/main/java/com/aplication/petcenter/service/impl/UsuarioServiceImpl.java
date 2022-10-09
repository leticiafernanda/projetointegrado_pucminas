package com.aplication.petcenter.service.impl;

import org.springframework.stereotype.Service;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.mapper.MapperUsuarioDTO;
import com.aplication.petcenter.repository.UsuarioRepository;
import com.aplication.petcenter.service.UsuarioService;

import lombok.RequiredArgsConstructor;
import lombok.var;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final MapperUsuarioDTO mapperUsuarioDTO;

	@Override
	public void save(UsuarioDTO usuario) {
		 var createUsuario = mapperUsuarioDTO.execute(usuario);
		 usuarioRepository.save(createUsuario);		
	}
}
