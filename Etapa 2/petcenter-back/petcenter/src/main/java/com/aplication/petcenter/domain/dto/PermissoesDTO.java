package com.aplication.petcenter.domain.dto;

import com.aplication.petcenter.domain.entity.TipoPermissão;
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
    private Integer id;
    private TipoPermissão tipo;
}
