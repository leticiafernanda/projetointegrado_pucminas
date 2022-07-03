package com.aplication.petcenter.service;

import com.aplication.petcenter.domain.dto.AdministradorDTO;
import com.aplication.petcenter.domain.entity.Administrador;

import java.util.List;

public interface AdministradorService {
    List<AdministradorDTO> findClienteList();

    void deleteById(Integer admId);

    void save(Administrador adm);
}
