package com.aplication.petcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Permissoes")
public class Permissoes implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id_permissao")
    private Integer id;

    @Column(name = "permissao")
    @Enumerated(EnumType.ORDINAL)
    private com.aplication.petcenter.domain.entity.Enum.TipoPermissão tipo;

    @Column(name = "nome_permissao")
    private String nome;
}
