package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import com.aplication.petcenter.domain.entity.TipoPermissão;

@Entity
@Table(name = "Permissoes")
public class Permissoes implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.ORDINAL)
    private TipoPermissão tipo;

}
