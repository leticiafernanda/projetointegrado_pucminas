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
@Data
@Table(name = "Rh")
@PrimaryKeyJoinColumn(name="id_funcionario")
public class Rh extends Funcionario implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Column(name = "id_rh")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
