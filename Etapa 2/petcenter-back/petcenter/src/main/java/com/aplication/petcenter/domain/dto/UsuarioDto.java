package com.aplication.petcenter.domain.dto;

import com.aplication.petcenter.domain.entity.TipoPermissão;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDto implements Serializable {
    private final Integer id;
    private final String email;
    private final String senha;
    private final TipoPermissão tipo;
}
