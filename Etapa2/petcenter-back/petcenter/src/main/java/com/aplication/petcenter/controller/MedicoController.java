package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/medico")
@RequiredArgsConstructor
@Validated
public class MedicoController {
    private final MedicoService medicoService;

    @GetMapping
    public ResponseEntity<List<MedicoDTO>> findMedicoList() {
        List<MedicoDTO> retorno = medicoService.findMedicoList();
        return ResponseEntity.ok(retorno);
    }
}
