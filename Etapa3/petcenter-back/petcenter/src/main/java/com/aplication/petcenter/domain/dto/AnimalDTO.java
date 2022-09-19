package com.aplication.petcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO implements Serializable {

    private static final long serialVersionUID = 6438141003220548923L;

    private Integer id;
    private String nome;
    private String raca;
    private String especie;
    private String pelagem;
    private ClienteDTO proprietario;
    private String peso;
    private Integer idade;
    private String genero;
}


