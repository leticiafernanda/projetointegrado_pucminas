package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import com.aplication.petcenter.repository.ClienteRepository;
import com.aplication.petcenter.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final MapperClienteDTO mapperClienteDTO;

    @Override
    public List<ClienteDTO> findClienteList() {
        List<Cliente> cliente = clienteRepository.findAll();
        return cliente.stream().map(mapperClienteDTO::execute).collect(Collectors.toList());
    }
}
