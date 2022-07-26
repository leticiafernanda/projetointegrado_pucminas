package com.aplication.petcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Consulta")
public class Consulta implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id_consulta")
    private Integer id;

    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "horario", nullable = false)
    private Time horario;

    @ManyToMany
    @JoinColumn(name = "descricao", nullable = false)
    private List<Servicos> servicos;

    @Column(name = "pedido", nullable = false)
    private String pedido;

    @Column(name = "custo", nullable = false)
    private Double custo;

    @OneToOne
    @JoinColumn(name = "cliente", nullable = false)
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "animal", nullable = false)
    private Animal animal;

    @OneToOne
    @JoinColumn(name = "medico", nullable = false)
    private Medico medico;

    @Column(name = "status", nullable = false)
    private String statusConsulta;


}