package com.aplication.petcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Medico")
public class Medico extends Funcionario implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id_medico")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name = "CRMV", nullable = false)
    private String CRMV;
}
