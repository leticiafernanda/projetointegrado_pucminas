package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import com.aplication.petcenter.domain.entity.TipoPermissão;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "permissao")
    @Enumerated(EnumType.ORDINAL)
    private TipoPermissão tipo;
}
