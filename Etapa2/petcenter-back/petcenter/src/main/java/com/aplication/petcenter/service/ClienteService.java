package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
    List<ClienteDTO> findClienteList();

    void deleteById(Integer clienteId);
}
