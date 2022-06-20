package com.aplication.petcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "proprietario", nullable = false)
    private Cliente proprietario;

    @ManyToOne
    @JoinColumn(name = "medico", nullable = false)
    private Medico medico;

    @Column(name = "data")
    private Date data;

    @Column(name = "hora")
    private Time hora;
    @Column(name = "telefoneCelular")
    private String telefoneCelular;

    @Column(name = "telefoneCasa")
    private String telefoneCasa;

    @Column(name = "email", unique = true)
    private String email;


}
