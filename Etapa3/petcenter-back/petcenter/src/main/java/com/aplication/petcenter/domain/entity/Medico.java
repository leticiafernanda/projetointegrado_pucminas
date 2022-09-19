package com.aplication.petcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Medico")
@PrimaryKeyJoinColumn(name="id_funcionario")

public class Medico extends Funcionario implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;


    @Column(name = "id_medico")
    private Integer id;

    @Column(name = "CRMV", nullable = false)
    private String CRMV;
}
