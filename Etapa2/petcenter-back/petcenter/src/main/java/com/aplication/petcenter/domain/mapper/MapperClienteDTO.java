package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Cliente;

public interface MapperClienteDTO {

    ClienteDTO execute(Cliente cliente);

    Cliente execute(ClienteDTO clienteDTO, Cliente currentCliente);
}
