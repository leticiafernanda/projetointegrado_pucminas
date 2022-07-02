package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.AdministradorDTO;
import com.aplication.petcenter.service.AdministradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/adm")
@RequiredArgsConstructor
@Validated
public class AdministradorController {

    private final AdministradorService administradorService;

    @GetMapping
    public ResponseEntity<List<AdministradorDTO>> findAdministradorList() {
        List<AdministradorDTO> retorno = administradorService.findClienteList();
        return ResponseEntity.ok(retorno);
    }
}
