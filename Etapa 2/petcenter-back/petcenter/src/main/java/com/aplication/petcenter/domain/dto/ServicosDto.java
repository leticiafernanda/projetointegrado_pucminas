package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ServicosDto implements Serializable {
    private final Integer id;
    private final String descricao;
    private final Double valor;
    private final List<VacinaDto> vacinas;
}
