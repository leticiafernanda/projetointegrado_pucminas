package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Usuario;

public interface MapperUsuarioDTO {

    UsuarioDTO execute(Usuario usuario);

}
