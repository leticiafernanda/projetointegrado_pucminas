package com.aplication.petcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDTO implements Serializable {
    private  Integer id;
    private ClienteDTO proprietario;
    private MedicoDTO medico;
    private  Date data;
    private  Time hora;
    private  String telefoneCelular;
    private  String telefoneCasa;
    private  String email;
}
