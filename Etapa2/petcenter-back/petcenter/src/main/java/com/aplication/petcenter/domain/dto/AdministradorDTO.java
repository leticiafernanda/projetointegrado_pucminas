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
public class AdministradorDTO implements Serializable {

    private  Integer id;
    private  String nome;
    private  String telefoneCelular;
    private  String telefoneCasa;
    private  String emailCorporativo;
}
