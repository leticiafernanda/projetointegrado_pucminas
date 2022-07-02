package com.aplication.petcenter.domain.mapper;

import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.domain.entity.Agendamento;

public interface MapperAgendamentoDTO {

    AgendamentoDTO execute(Agendamento agendamento);

}
