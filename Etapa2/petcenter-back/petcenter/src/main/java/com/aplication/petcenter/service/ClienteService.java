package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Cliente;

import java.util.List;

public interface ClienteService {
    List<ClienteDTO> findClienteList();

    void deleteById(Integer clienteId);

    void save(Cliente cliente);

    ClienteDTO updateById(Integer clienteId, ClienteDTO clienteDTO);
}
