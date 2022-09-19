package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> findUsuarioList();

    void deleteById(Integer usuarioId);

    void save(Usuario usuario);
}
