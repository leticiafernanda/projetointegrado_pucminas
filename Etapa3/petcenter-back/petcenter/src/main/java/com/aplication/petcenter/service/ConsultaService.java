package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.ConsultaDTO;
import com.aplication.petcenter.domain.entity.Consulta;

import java.util.List;

public interface ConsultaService {
    List<ConsultaDTO> findConsultaList();

    void deleteById(Integer consultaId);

    void save(Consulta consulta);
}
