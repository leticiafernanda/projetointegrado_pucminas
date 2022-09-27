package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.AgendamentoBasicDTO;
import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.entity.Agendamento;
import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.domain.entity.Medico;
import com.aplication.petcenter.domain.mapper.MapperAgendamentoDTO;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import com.aplication.petcenter.domain.mapper.MapperMedicoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperAgendamentoDTOImpl implements MapperAgendamentoDTO {

    private final MapperClienteDTO mapperClienteDTO;
    private final MapperMedicoDTO mapperMedicoDTO;

    @Override
      public AgendamentoDTO execute(Agendamento agendamento) {
        return AgendamentoDTO.builder()
                .id(agendamento.getId())
                .proprietario(getProprietario(agendamento))
                .medico(getMedico(agendamento))
                .data(agendamento.getData())
                .hora(agendamento.getHora())
                .telefoneCasa(agendamento.getTelefoneCasa())
                .telefoneCelular(agendamento.getTelefoneCelular())
                .email(agendamento.getEmail())
                .build();
    }
    @Override
	public Agendamento execute(AgendamentoBasicDTO agendamento) {
    	 return Agendamento.builder()
                 .id(agendamento.getId())
                 .proprietario(getProprietarioId(agendamento.getIdProprietario()))
                 .medico(getMedicoId (agendamento.getIdMedico()))
                 .data(agendamento.getData())
                 .hora(agendamento.getHora())
                 .telefoneCasa(agendamento.getTelefoneCasa())
                 .telefoneCelular(agendamento.getTelefoneCelular())
                 .email(agendamento.getEmail())
                 .build();
	}

    private Medico getMedicoId(Integer idMedico) {
    	return (Medico) Medico.builder()
				.id(idMedico)
				.build();
	}
	private Cliente getProprietarioId(Integer idProprietario) {
    	return Cliente.builder()
				.id(idProprietario)
				.build();
	}
	private ClienteDTO getProprietario(Agendamento agendamento) {
        return agendamento.getProprietario() != null
                ? mapperClienteDTO.execute(agendamento.getProprietario())
                : null;
    }

    private MedicoDTO getMedico(Agendamento agendamento) {
        return agendamento.getProprietario() != null
                ? mapperMedicoDTO.execute(agendamento.getMedico())
                : null;
    }
}
