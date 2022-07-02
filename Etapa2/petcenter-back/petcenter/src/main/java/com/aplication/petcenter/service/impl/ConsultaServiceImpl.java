package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.repository.ConsultaRepository;
import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsultaServiceImpl implements ConsultaService {

    private final ConsultaRepository consultaRepository;
}
