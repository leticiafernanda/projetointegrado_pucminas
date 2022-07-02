package com.aplication.petcenter.controller;

import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/consulta")
@RequiredArgsConstructor
@Validated
public class ConsultaController {
    private final ConsultaService consultaService;

}
