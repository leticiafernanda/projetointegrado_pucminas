package com.aplication.petcenter.domain.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Agendamento")
public class Agendamento implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id_agendamento")
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_cliente")
    private Cliente proprietario;

    @OneToOne
    @JoinColumn(name="id_medico")
    private Funcionario medico;

    @Column(name = "data")
    private Date data;

    @Column(name = "hora")
    private LocalTime hora;

    @Column(name = "telefone_celular")
    private String telefoneCelular;

    @Column(name = "telefone_casa")
    private String telefoneCasa;

    @Column(name = "email", unique = true)
    private String email;


}
