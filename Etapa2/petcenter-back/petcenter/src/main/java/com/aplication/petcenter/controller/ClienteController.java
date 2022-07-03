package com.aplication.petcenter.controller;

import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{id_cliente}")
    public ResponseEntity<Void> deleteCliente(@PathVariable(value = "id_cliente") Integer clienteId) {
        clienteService.deleteById(clienteId);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Void> createCliente(@RequestBody Cliente cliente) {
        clienteService.save(cliente);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id_cliente}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<ClienteDTO> updateCliente(@PathVariable Integer clienteId, @RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity.ok(clienteService.updateById(clienteId, clienteDTO));
    }
}
