package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Funcionario")
public abstract class Funcionario implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefoneCelular")
    private String telefoneCelular;

    @Column(name = "telefoneCasa")
    private String telefoneCasa;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "dataNascimento")
    private Date dataNascimento;

}
