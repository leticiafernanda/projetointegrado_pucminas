package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.ConsultaDTO;

import java.util.List;

public interface ConsultaService {
    List<ConsultaDTO> findConsultaList();
}
