package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.repository.ClienteRepository;
import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
}
