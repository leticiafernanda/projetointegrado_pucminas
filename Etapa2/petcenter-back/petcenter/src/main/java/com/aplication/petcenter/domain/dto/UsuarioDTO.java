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
    private  Integer id;
    private  String email;
    private  String senha;
    private  TipoPermissão tipo;
}
