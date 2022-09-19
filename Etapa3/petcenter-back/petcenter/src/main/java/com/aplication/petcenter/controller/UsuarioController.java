package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Agendamento;
import com.aplication.petcenter.domain.entity.Usuario;
import com.aplication.petcenter.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{id_usuario}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable(value = "id_usuario") Integer usuarioId) {
        usuarioService.deleteById(usuarioId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Void> createUsuarios(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
