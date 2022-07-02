package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.entity.Medico;

public interface MapperMedicoDTO {

    MedicoDTO execute(Medico medico);

}
