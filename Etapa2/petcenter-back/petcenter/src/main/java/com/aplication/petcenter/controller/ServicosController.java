package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.ServicosDTO;
import com.aplication.petcenter.service.ServicosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/servicos")
@RequiredArgsConstructor
@Validated
public class ServicosController {
    private final ServicosService servicoService;

    @GetMapping
    public ResponseEntity<List<ServicosDTO>> findServicoList() {
        List<ServicosDTO> retorno = servicoService.findServicoList();
        return ResponseEntity.ok(retorno);
    }
}
