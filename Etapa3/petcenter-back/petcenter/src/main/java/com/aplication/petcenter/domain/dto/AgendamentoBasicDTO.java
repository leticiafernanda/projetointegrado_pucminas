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
public class AgendamentoBasicDTO implements Serializable {
 	
	private static final long serialVersionUID = 8493252539831607415L;
	
	private  Integer id;
    private  Integer idProprietario;
    private  Integer idMedico;
    private  Date data;
    private  Time hora;
    private  String telefoneCelular;
    private  String telefoneCasa;
    private  String email;
}
