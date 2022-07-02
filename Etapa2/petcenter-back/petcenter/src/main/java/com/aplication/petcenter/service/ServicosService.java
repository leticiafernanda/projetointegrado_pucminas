package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.ServicosDTO;

import java.util.List;

public interface ServicosService {
    List<ServicosDTO> findServicoList();

    void deleteById(Integer servicoId);
}
