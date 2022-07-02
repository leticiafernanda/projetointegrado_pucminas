package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.repository.ServicosRepository;
import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.ServicosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServicoServiceImpl implements ServicosService {

    private final ServicosRepository servicoepository;
}
