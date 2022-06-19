package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Consulta")
public class Consulta implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "horario", nullable = false)
    private Time horario;

    @OneToOne
    @JoinColumn(name = "servico", nullable = false)
    private List<Servicos> servicos;

    @Column(name = "pedido", nullable = false)
    private String pedido;

    @Column(name = "custo", nullable = false)
    private Double custo;

    @OneToOne
    @JoinColumn(name = "cliente", nullable = false)
    private Cliente cliente;

}
