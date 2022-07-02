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
public class FuncionarioDTO implements Serializable {
    private  Integer id;
    private  String nome;
    private  String endereco;
    private  String telefoneCelular;
    private  String telefoneCasa;
    private  String email;
    private  Date dataNascimento;
}
