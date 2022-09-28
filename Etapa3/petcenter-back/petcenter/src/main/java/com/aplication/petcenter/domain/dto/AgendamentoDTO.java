package com.aplication.petcenter.domain.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDTO implements Serializable {
 	private static final long serialVersionUID = 2846353389532433168L;
 	
	private  Integer id;
    private ClienteDTO proprietario;
    private MedicoDTO medico;
    private  Date data;
    private  LocalTime hora;
    private  String telefoneCelular;
    private  String telefoneCasa;
    private  String email;
}
