package com.aplication.petcenter.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.petcenter.domain.dto.ConsultaDTO;
import com.aplication.petcenter.domain.entity.Consulta;
import com.aplication.petcenter.service.ConsultaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/consulta")
@RequiredArgsConstructor
@Validated
public class ConsultaController {
    private final ConsultaService consultaService;

    @GetMapping
    public ResponseEntity<List<ConsultaDTO>> findConsultaList() {
        List<ConsultaDTO> retorno = consultaService.findConsultaList();
        return ResponseEntity.ok(retorno);
    }
    @DeleteMapping("/{id_consulta}")
    public ResponseEntity<Void> deleteConsulta(@PathVariable(value = "id_consulta") Integer consultaId) {
        consultaService.deleteById(consultaId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Void> createConsulta(@RequestBody Consulta consulta) {
        consultaService.save(consulta);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
