package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Administrador")
public class Administrador implements Serializable {

    private static final long serialVersionUID = -7371572672016346475L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;


    @Column(name = "telefoneCelular")
    private String telefoneCelular;

    @Column(name = "telefoneCasa")
    private String telefoneCasa;

    @Column(name = "emailCorporativo", unique = true)
    private String emailCorporativo;

}