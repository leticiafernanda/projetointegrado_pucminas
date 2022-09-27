package com.aplication.petcenter.service;

import java.util.List;

import com.aplication.petcenter.domain.dto.AgendamentoBasicDTO;
import com.aplication.petcenter.domain.dto.AgendamentoDTO;

public interface AgendamentoService {
    List<AgendamentoDTO> findAgendamentoList();

    void save(AgendamentoBasicDTO agendamento);
}
