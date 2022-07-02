package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.repository.AnimalRepository;
import com.aplication.petcenter.repository.ClienteRepository;
import com.aplication.petcenter.service.AnimalService;
import com.aplication.petcenter.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
}
