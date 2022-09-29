package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.AgendamentoBasicDTO;
import com.aplication.petcenter.domain.dto.ConsultaBasicDTO;
import com.aplication.petcenter.domain.dto.ConsultaDTO;
import com.aplication.petcenter.domain.entity.Consulta;

public interface MapperConsultaDTO {

    ConsultaDTO execute(Consulta consulta);
    
    Consulta execute(AgendamentoBasicDTO agendamento);
    


}
