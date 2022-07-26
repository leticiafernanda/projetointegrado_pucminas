package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.AgendamentoDTO;
import com.aplication.petcenter.domain.entity.Agendamento;
import com.aplication.petcenter.domain.mapper.MapperAgendamentoDTO;
import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class AgendamentoServiceImpl implements AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    private final MapperAgendamentoDTO mapperAgendamentoDTO;

    @Override
    public List<AgendamentoDTO> findAgendamentoList() {
        List<Agendamento> agendamentos = agendamentoRepository.findAll();
        return agendamentos.stream().map(mapperAgendamentoDTO::execute).collect(Collectors.toList());
    }

    @Transactional
    public void save(Agendamento agendamento) {
        agendamentoRepository.save(agendamento);
    }
}
