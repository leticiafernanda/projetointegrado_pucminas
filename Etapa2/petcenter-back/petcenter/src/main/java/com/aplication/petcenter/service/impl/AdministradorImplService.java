package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.AdministradorDTO;
import com.aplication.petcenter.domain.entity.Administrador;
import com.aplication.petcenter.service.AdministradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class AdministradorImplService implements AdministradorService {

    @Override
    public List<AdministradorDTO> findClienteList() {
        return null;
    }

    @Override
    public void deleteById(Integer admId) {

    }

    @Override
    public void save(Administrador adm) {

    }
}
