package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.ServicosDTO;
import com.aplication.petcenter.domain.entity.Servicos;

import java.util.List;

public interface ServicosService {
    List<ServicosDTO> findServicoList();

    void deleteById(Integer servicoId);

    void save(Servicos servicos);
}
