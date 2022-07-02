package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/usuario")
@RequiredArgsConstructor
@Validated
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> findUsuarioList() {
        List<UsuarioDTO> retorno = usuarioService.findUsuarioList();
        return ResponseEntity.ok(retorno);
    }
}
