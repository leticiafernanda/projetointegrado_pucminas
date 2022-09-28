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

import com.aplication.petcenter.domain.dto.AgendamentoBasicDTO;
import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.service.AgendamentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/agendamento")
@RequiredArgsConstructor
@Validated
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @GetMapping
    public ResponseEntity<List<AgendamentoDTO>> findAgendamentoList() {
        List<AgendamentoDTO> retorno = agendamentoService.findAgendamentoList();
        return ResponseEntity.ok(retorno);
    }
    @PostMapping
    public ResponseEntity<Void> createAgendamento(@RequestBody AgendamentoBasicDTO agendamento) {
        agendamentoService.save(agendamento);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{id_consulta}")
    public ResponseEntity<Void> deleteConsulta(@PathVariable(value = "id_consulta") Integer consultaId) {
    	agendamentoService.deleteById(consultaId);
        return ResponseEntity.noContent().build();
    }

}
