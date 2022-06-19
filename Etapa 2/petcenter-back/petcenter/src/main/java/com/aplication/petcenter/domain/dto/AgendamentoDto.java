package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Data
public class AgendamentoDto implements Serializable {
    private final Integer id;
    private final ClienteDto proprietario;
    private final MedicoDto medico;
    private final Date data;
    private final Time hora;
    private final String telefoneCelular;
    private final String telefoneCasa;
    private final String email;
}
