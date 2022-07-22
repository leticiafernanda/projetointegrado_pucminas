package com.aplication.petcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaDTO implements Serializable {
    private  Integer id;
    private  Date data;
    private  Time horario;
    private  List<ServicosDTO> servicos;
    private  String pedido;
    private  Double custo;
    private ClienteDTO cliente;
    private AnimalDTO animal;
    private MedicoDTO medico;
    private String statusConsulta;
}
