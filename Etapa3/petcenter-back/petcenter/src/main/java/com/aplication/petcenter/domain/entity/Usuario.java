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
@Table(name = "Usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1816527773309623218L;

    @Id
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "senha", unique = true)
    private String senha;

    @Column(name = "id_permissao")
    @Enumerated(EnumType.ORDINAL)
    private com.aplication.petcenter.domain.entity.Enum.TipoPermissão tipo;
    
}
