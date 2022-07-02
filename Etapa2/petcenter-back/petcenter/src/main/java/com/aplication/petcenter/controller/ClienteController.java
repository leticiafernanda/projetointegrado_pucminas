package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cliente")
@RequiredArgsConstructor
@Validated
public class ClienteController {
    private final ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findClienteList() {
        List<ClienteDTO> retorno = clienteService.findClienteList();
        return ResponseEntity.ok(retorno);
    }
}
