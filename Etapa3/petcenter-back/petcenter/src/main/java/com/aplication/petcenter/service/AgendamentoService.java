package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.domain.entity.Agendamento;

import java.util.List;

public interface AgendamentoService {
    List<AgendamentoDTO> findAgendamentoList();

    void save(Agendamento agendamento);
}
