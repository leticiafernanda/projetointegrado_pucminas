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
@Table(name = "Cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id_cliente")
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "telefone_celular")
    private String telefoneCelular;

    @Column(name = "telefone_casa")
    private String telefoneCasa;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "data_nascimento")
    private Date dataNascimento;
}
