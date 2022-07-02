package com.aplication.petcenter.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServicosDTO implements Serializable {
    private  Integer id;
    private  String descricao;
    private  Double valor;
    private  List<VacinaDTO> vacinas;
}
