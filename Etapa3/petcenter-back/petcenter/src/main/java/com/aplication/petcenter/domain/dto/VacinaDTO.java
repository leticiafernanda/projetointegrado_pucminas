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
public class VacinaDTO implements Serializable {

    private  Integer id;
    private  String nome;
    private  Date validade;
    private  Date fabricacao;
    private  String lote;
}
