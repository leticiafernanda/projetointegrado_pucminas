package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.ServicosDTO;
import com.aplication.petcenter.domain.dto.VacinaDTO;
import com.aplication.petcenter.domain.entity.Servicos;
import com.aplication.petcenter.domain.mapper.MapperServicosDTO;
import com.aplication.petcenter.domain.mapper.MapperVacinaDTO;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MapperServicosDTOImpl implements MapperServicosDTO {

    private final MapperVacinaDTO mappervacinaDTO;

    @Override
    public ServicosDTO execute(Servicos servicos) {
        return ServicosDTO.builder()
                .id(servicos.getId())
                .descricao(servicos.getDescricao())
                .valor(servicos.getValor())
                .vacinas(getVacinas(servicos))
                .build();
    }
    private List<VacinaDTO> getVacinas(Servicos servicos) {
        var vacinas = VacinaDTO.builder()
                .id(servicos.getId())
                .build();
        return Collections.singletonList(vacinas);
    }
    }

