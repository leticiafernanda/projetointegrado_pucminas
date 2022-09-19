package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.AdministradorDTO;
import com.aplication.petcenter.domain.entity.Administrador;
import com.aplication.petcenter.service.AdministradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/adm")
@RequiredArgsConstructor
@Validated
public class AdministradorController {

    private final AdministradorService administradorService;

    @GetMapping
    public ResponseEntity<List<AdministradorDTO>> findAdministradorList() {
        List<AdministradorDTO> retorno = administradorService.findClienteList();
        return ResponseEntity.ok(retorno);
    }
    @DeleteMapping("/{id_administrador}")
    public ResponseEntity<Void> deleteAdministrados(@PathVariable(value = "id_administrador") Integer admId) {
        administradorService.deleteById(admId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Void> createAdmin(@RequestBody Administrador adm) {
        administradorService.save(adm);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
