package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AdministradorDto implements Serializable {
    private final Integer id;
    private final String nome;
    private final String telefoneCelular;
    private final String telefoneCasa;
    private final String emailCorporativo;
}
