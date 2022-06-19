package com.aplication.petcenter.domain.dto;

import com.aplication.petcenter.domain.entity.TipoPermissão;
import lombok.Data;

import java.io.Serializable;

@Data
public class PermissoesDto implements Serializable {
    private final Integer id;
    private final TipoPermissão tipo;
}
