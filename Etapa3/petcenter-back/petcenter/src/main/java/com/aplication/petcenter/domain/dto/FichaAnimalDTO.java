package com.aplication.petcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FichaAnimalDTO implements Serializable {

	private static final long serialVersionUID = -752372378403144023L;
	
	private  Integer id;
    private ClienteDTO proprietario;
    private AnimalDTO animal;
    private MedicoDTO medico;
    private  String exames;
    private  String solicitaExames;
    private  String procedimento;
    private  String medicamentos;
    private  Date data;
}
