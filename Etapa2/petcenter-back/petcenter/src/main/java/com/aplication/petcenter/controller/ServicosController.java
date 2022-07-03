package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.ServicosDTO;
import com.aplication.petcenter.domain.entity.Servicos;
import com.aplication.petcenter.service.ServicosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{id_servico}")
    public ResponseEntity<Void> deleteServico(@PathVariable(value = "id_servico") Integer servicoId) {
        servicoService.deleteById(servicoId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Void> createServicos(@RequestBody Servicos servicos) {
        servicoService.save(servicos);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
