package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{id_medico}")
    public ResponseEntity<Void> deleteMedico(@PathVariable(value = "id_medico") Integer medicoId) {
        medicoService.deleteById(medicoId);
        return ResponseEntity.noContent().build();
    }
}
