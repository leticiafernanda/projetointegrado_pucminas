package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.entity.Medico;

import java.util.List;

public interface MedicoService {
    List<MedicoDTO> findMedicoList();

    void deleteById(Integer medicoId);

    void save(Medico medico);
}
