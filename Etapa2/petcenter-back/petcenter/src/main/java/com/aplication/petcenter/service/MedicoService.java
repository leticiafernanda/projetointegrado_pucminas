package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.MedicoDTO;

import java.util.List;

public interface MedicoService {
    List<MedicoDTO> findMedicoList();
}
