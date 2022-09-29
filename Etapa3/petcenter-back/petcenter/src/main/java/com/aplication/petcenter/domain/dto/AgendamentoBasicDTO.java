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
public class AgendamentoBasicDTO implements Serializable {
 	
	private static final long serialVersionUID = 8493252539831607415L;
	
	private  Integer id;
    private  Integer idAnimal;
    private  Integer idProprietario;
    private  Integer idMedico;
    private  Date data;
    private  LocalTime hora;
    private  String telefoneCelular;
    private  String telefoneCasa;
    private  String email;
}
