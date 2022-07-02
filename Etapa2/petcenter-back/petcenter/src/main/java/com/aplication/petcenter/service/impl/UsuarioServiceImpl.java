package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.repository.UsuarioRepository;
import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
}
