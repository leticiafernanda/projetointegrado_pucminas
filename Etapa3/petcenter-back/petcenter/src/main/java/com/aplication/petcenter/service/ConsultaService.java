package com.aplication.petcenter.service;

import java.util.List;

import com.aplication.petcenter.domain.dto.ConsultaBasicDTO;
import com.aplication.petcenter.domain.dto.ConsultaDTO;
import com.aplication.petcenter.domain.entity.Consulta;

public interface ConsultaService {
    List<ConsultaDTO> findConsultaList();

    void deleteById(Integer consultaId);

    void save(Consulta consulta);
    
    void updateById(Integer consultaId);

}
