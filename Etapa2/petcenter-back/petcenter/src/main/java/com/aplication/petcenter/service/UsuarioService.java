package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> findUsuarioList();

    void deleteById(Integer usuarioId);
}
