package com.aplication.petcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Administrador")
public class Administrador implements Serializable {

    private static final long serialVersionUID = -7371572672016346475L;

    @Id
    @Column(name = "id_administrador")
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "telefone_celular")
    private String telefoneCelular;

    @Column(name = "telefone_casa")
    private String telefoneCasa;

    @Column(name = "email_corporativo", unique = true)
    private String emailCorporativo;

}