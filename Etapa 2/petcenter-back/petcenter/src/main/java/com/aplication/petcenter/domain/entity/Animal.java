package com.aplication.petcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Animal")
public class Animal implements Serializable {

    private static final long serialVersionUID = -8253582268992035667L;

    @Id
    @Column(name = "id_animal")
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

    @Column(name = "genero", nullable = false)
    private String genero;

}
