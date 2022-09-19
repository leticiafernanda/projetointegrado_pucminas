package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.entity.Medico;
import com.aplication.petcenter.domain.mapper.MapperMedicoDTO;
import com.aplication.petcenter.repository.MedicoRepository;
import com.aplication.petcenter.service.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MedicoServiceImpl implements MedicoService {

    private final MedicoRepository medicoRepository;
    private final MapperMedicoDTO mapperMedicoDTO;

    @Override
    public List<MedicoDTO> findMedicoList() {
        List<Medico> medicos = medicoRepository.findAll();
        return medicos.stream().map(mapperMedicoDTO::execute).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Integer medicoId) {
        medicoRepository.deleteById(medicoId);
    }

    @Override
    public void save(Medico medico) {
        medicoRepository.save(medico);
    }
}
