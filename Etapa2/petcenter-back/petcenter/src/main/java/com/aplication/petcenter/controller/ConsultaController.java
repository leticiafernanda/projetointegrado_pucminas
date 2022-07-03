package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.ConsultaDTO;
import com.aplication.petcenter.domain.entity.Agendamento;
import com.aplication.petcenter.domain.entity.Consulta;
import com.aplication.petcenter.service.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
