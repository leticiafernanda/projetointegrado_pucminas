package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Servicos")
public class Servicos implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @ManyToMany(mappedBy = "Servicos", cascade = CascadeType.ALL)
    private List<Vacina> vacinas = new ArrayList<>();


    public Servicos() {
    }
    public Servicos(Integer id, String descricao, Double valor) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
}
