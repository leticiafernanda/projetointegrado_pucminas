package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ClienteDto implements Serializable {
    private final Integer id;
    private final String nome;
    private final String endereco;
    private final String telefoneCelular;
    private final String telefoneCasa;
    private final String email;
    private final Date dataNascimento;
}
