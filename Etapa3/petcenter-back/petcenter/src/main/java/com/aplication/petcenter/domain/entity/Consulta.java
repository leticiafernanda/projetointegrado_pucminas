package com.aplication.petcenter.domain.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private LocalTime horario;

    @ManyToMany
    @JoinColumn(name = "descricao")
    private List<Servicos> servicos;

    @Column(name = "pedido")
    private String pedido;

    @Column(name = "custo")
    private Double custo;

    @OneToOne
    @JoinColumn(name = "cliente", nullable = false)
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "animal", nullable = false)
    private Animal animal;

    @OneToOne
    @JoinColumn(name = "medico", nullable = false)
    private Funcionario medico;

    @Column(name = "status", nullable = false)
    private String statusConsulta;


}