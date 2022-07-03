package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.ServicosDTO;
import com.aplication.petcenter.domain.entity.Servicos;
import com.aplication.petcenter.domain.mapper.MapperServicosDTO;
import com.aplication.petcenter.repository.ServicosRepository;
import com.aplication.petcenter.service.ServicosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ServicoServiceImpl implements ServicosService {

    private final ServicosRepository servicoRepository;
    private final MapperServicosDTO mapperServicosDTO;

    @Override
    public List<ServicosDTO> findServicoList() {
        List<Servicos> servicos = servicoRepository.findAll();
        return servicos.stream().map(mapperServicosDTO::execute).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Integer servicoId) {
        servicoRepository.deleteById(servicoId);;
    }

    @Override
    public void save(Servicos servicos) {
        servicoRepository.save(servicos);
    }
}
