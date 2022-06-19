package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AnimalDto implements Serializable {
    private final Integer id;
    private final String nome;
    private final String raca;
    private final String especie;
    private final String pelagem;
    private final ClienteDto proprietario;
    private final String peso;
    private final Integer idade;
}
