package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.VacinaDTO;
import com.aplication.petcenter.domain.entity.Vacina;
import com.aplication.petcenter.domain.mapper.MapperVacinaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperVacinaDTOImpl implements MapperVacinaDTO {
    @Override
    public VacinaDTO execute(Vacina vacina) {
        return VacinaDTO.builder()
                .id(vacina.getId())
                .nome(vacina.getNome())
                .validade(vacina.getValidade())
                .fabricacao(vacina.getFabricacao())
                .lote(vacina.getLote())
                .build();
    }


}
