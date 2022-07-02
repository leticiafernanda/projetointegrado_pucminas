package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.AgendamentoDTO;

import java.util.List;

public interface AgendamentoService {
    List<AgendamentoDTO> findAgendamentoList();
}
