package com.aplication.petcenter.domain.dto;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaDTO implements Serializable {

	private static final long serialVersionUID = -4373598965345612757L;
	
	private  Integer id;
    private  Date data;
    private  LocalTime horario;
    private  List<ServicosDTO> servicos;
    private  String pedido;
    private  Double custo;
    private ClienteDTO cliente;
    private AnimalDTO animal;
    private MedicoDTO medico;
    private String statusConsulta;
}
