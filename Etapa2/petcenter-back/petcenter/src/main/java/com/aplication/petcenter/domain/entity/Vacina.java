package com.aplication.petcenter.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Vacina")
public class Vacina implements Serializable {

    private static final long serialVersionUID = 1816527773309623218L;

    @Id
    @Column(name = "id_vacina")
    private Integer id;
    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "validade")
    private Date validade;

    @Column(name = "fabricacao")
    private Date fabricacao;

    @Column(name = "lote")
    private String lote;

    @OneToMany(mappedBy = "descricao")
    private List<Servicos> servico;

}
