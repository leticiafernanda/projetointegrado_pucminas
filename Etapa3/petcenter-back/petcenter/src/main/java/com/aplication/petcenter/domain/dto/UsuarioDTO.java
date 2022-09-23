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
public class UsuarioDTO implements Serializable {
 
	private static final long serialVersionUID = 7351643912483394438L;
	
	private  Integer id;
    private  String email;
    private  String senha;
    private  TipoPermissão tipo;
}
