package com.aplication.petcenter.controller;

import com.aplication.petcenter.service.AdministradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/adm")
@RequiredArgsConstructor
@Validated
public class AdministradorController {

    private final AdministradorService administradorService;
}
