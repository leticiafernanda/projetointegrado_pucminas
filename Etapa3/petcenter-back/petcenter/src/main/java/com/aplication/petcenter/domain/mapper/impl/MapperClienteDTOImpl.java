package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import org.springframework.stereotype.Component;

@Component
public class MapperClienteDTOImpl implements MapperClienteDTO {


    @Override
    public ClienteDTO execute(Cliente cliente) {
        return ClienteDTO.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .dataNascimento(cliente.getDataNascimento())
                .email(cliente.getEmail())
                .endereco(cliente.getEndereco())
                .telefoneCasa(cliente.getTelefoneCasa())
                .telefoneCelular(cliente.getTelefoneCelular())
                .build();
    }

    @Override
    public Cliente execute(ClienteDTO clienteDTO, Cliente currentCliente) {
        currentCliente.setNome(clienteDTO.getNome());
        currentCliente.setDataNascimento(clienteDTO.getDataNascimento());
        currentCliente.setEmail(clienteDTO.getEmail());
        currentCliente.setEndereco(clienteDTO.getEndereco());
        currentCliente.setTelefoneCasa(clienteDTO.getTelefoneCasa());
        currentCliente.setTelefoneCasa(clienteDTO.getTelefoneCelular());
        return currentCliente;
    }
}
