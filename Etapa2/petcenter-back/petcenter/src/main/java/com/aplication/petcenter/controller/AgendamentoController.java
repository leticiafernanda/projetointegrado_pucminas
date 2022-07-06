package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.domain.entity.Agendamento;
import com.aplication.petcenter.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Void> createAgendamento(@RequestBody Agendamento agendamento) {
        agendamentoService.save(agendamento);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
