package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
public class ConsultaDto implements Serializable {
    private final Integer id;
    private final Date data;
    private final Time horario;
    private final List<ServicosDto> servicos;
    private final String pedido;
    private final Double custo;
    private final ClienteDto cliente;
    private final AnimalDto animal;
}
