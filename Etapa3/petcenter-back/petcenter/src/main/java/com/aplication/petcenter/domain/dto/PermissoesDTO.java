package com.aplication.petcenter.domain.dto;

import com.aplication.petcenter.domain.entity.Enum.TipoPermissão;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PermissoesDTO implements Serializable {

	private static final long serialVersionUID = -6164872254959634372L;
	
	private Integer id;
    private TipoPermissão tipo;
    private String nome;
}
