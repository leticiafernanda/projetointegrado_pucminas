package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    @Override
    public List<AgendamentoDTO> findAgendamentoList() {
        return null;
    }
}
