package com.aplication.petcenter.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.aplication.petcenter.domain.dto.ConsultaDTO;
import com.aplication.petcenter.domain.entity.Consulta;
import com.aplication.petcenter.domain.mapper.MapperConsultaDTO;
import com.aplication.petcenter.repository.ConsultaRepository;
import com.aplication.petcenter.service.ConsultaService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConsultaServiceImpl implements ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final MapperConsultaDTO mapperConsultaDTO;

    @Override
    public List<ConsultaDTO> findConsultaList() {
        List<Consulta> consultas = consultaRepository.findAll();
        return consultas.stream().map(mapperConsultaDTO::execute).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Integer consultaId) {
        consultaRepository.deleteById(consultaId);
    }

    @Override
    public void save(Consulta consulta) {
        consultaRepository.save(consulta);
    }

	@Override
	public Consulta updateById(Integer consultaId) {
			Consulta currentConsulta = consultaRepository.findById(consultaId).orElse(null);
			currentConsulta.setId(consultaId);
	        currentConsulta.setStatusConsulta("Cancelado");
	        consultaRepository.save(currentConsulta);
	        return currentConsulta;
	   	
	}
}
