package com.aplication.petcenter.controller;

import com.aplication.petcenter.service.AdministradorService;
import com.aplication.petcenter.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/agendamento")
@RequiredArgsConstructor
@Validated
public class AgendamentoController {

    private final AgendamentoService agendamentoService;
}
