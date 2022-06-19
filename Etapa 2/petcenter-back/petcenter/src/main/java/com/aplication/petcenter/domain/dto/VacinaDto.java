package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class VacinaDto implements Serializable {
    private final Integer id;
    private final String nome;
    private final Date validade;
    private final Date fabricacao;
    private final String lote;
}
