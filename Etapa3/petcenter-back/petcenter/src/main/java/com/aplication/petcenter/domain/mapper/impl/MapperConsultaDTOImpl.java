package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.*;
import com.aplication.petcenter.domain.entity.Consulta;
import com.aplication.petcenter.domain.mapper.*;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MapperConsultaDTOImpl implements MapperConsultaDTO {

    private final MapperClienteDTO mapperClienteDTO;
    private final MapperAnimalDTO mapperAnimalDTO;
    private final MapperServicosDTO mapperServicoDTO;
    private final MapperMedicoDTO mapperMedicoDTO;

    @Override
    public ConsultaDTO execute(Consulta consulta) {
        return ConsultaDTO.builder()
                .id(consulta.getId())
                .data(consulta.getData())
                .horario(consulta.getHorario())
                .pedido(consulta.getPedido())
                .custo(consulta.getCusto())
                .cliente(getProprietario(consulta))
                .animal(getAnimal(consulta))
                .medico(getMedico(consulta))
                .servicos(getServicos(consulta))
                .statusConsulta(consulta.getStatusConsulta())
                .build();

    }
    private ClienteDTO getProprietario(Consulta consulta) {
        return consulta.getCliente() != null
                ? mapperClienteDTO.execute(consulta.getCliente())
                : null;
    }
    private AnimalDTO getAnimal(Consulta consulta) {
        return consulta.getAnimal() != null
                ? mapperAnimalDTO.execute(consulta.getAnimal())
                : null;
    }
    private MedicoDTO getMedico(Consulta consulta) {
        return consulta.getMedico() != null
                ? mapperMedicoDTO.execute(consulta.getMedico())
                : null;
    }

    private List<ServicosDTO> getServicos(Consulta consulta) {
        var consultas = ServicosDTO.builder()
                .id(consulta.getId())
                .build();

        return Collections.singletonList(consultas);
    }
}
