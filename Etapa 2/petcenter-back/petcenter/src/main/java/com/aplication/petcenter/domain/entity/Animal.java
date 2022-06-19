package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Animal")
public class Animal implements Serializable {

    private static final long serialVersionUID = -8253582268992035667L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "raca")
    private String raca;

    @Column(name = "especie")
    private String especie;

    @Column(name = "pelagem")
    private String pelagem;

    @ManyToOne
    @JoinColumn(name = "proprietario", nullable = false)
    private Cliente proprietario;

    @Column(name = "peso")
    private String peso;

    @Column(name = "idade")
    private Integer idade;

}
