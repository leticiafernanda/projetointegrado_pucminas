package com.aplication.petcenter.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.aplication.petcenter.domain.dto.AgendamentoBasicDTO;
import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.domain.entity.Agendamento;
import com.aplication.petcenter.domain.mapper.MapperAgendamentoDTO;
import com.aplication.petcenter.domain.mapper.MapperConsultaDTO;
import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.repository.ConsultaRepository;
import com.aplication.petcenter.service.AgendamentoService;

import lombok.RequiredArgsConstructor;
import lombok.var;

@Service
@RequiredArgsConstructor
@Transactional
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final ConsultaRepository consultaRepository;
    private final MapperAgendamentoDTO mapperAgendamentoDTO;
    private final MapperConsultaDTO mapperConsultaDTO;

    @Override
    public List<AgendamentoDTO> findAgendamentoList() {
        List<Agendamento> agendamentos = agendamentoRepository.findAll();
        return agendamentos.stream().map(mapperAgendamentoDTO::execute).collect(Collectors.toList());
    }
    @Transactional
    public void save(AgendamentoBasicDTO agendamento) {
    	var createAgendamento = mapperAgendamentoDTO.execute(agendamento);
    	var createConsulta = mapperConsultaDTO.execute(agendamento);
    	consultaRepository.save(createConsulta);
        agendamentoRepository.save(createAgendamento);
    }
	
	public void deleteById(Integer consultaId) {
		agendamentoRepository.deleteById(consultaId);		
	}

}
