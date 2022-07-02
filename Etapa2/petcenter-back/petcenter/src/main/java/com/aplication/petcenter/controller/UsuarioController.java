package com.aplication.petcenter.controller;

import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/usuario")
@RequiredArgsConstructor
@Validated
public class UsuarioController {
    private final UsuarioService usuarioService;

}
