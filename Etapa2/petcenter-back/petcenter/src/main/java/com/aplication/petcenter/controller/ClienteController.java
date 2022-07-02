package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
@RequiredArgsConstructor
@Validated
public class ClienteController {
    private final ClienteService clienteService;

}
