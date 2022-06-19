package com.aplication.petcenter.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FichaAnimal")
public class FichaAnimal implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "proprietario", nullable = false)
    private Cliente proprietario;

    @OneToOne
    @JoinColumn(name = "proprietario", nullable = false)
    private Animal animal;

    @OneToOne
    @JoinColumn(name = "medico", nullable = false)
    private Medico medico;

    @Column(name = "exames", nullable = false)
    private String exames;

    @Column(name = "solicitaExames")
    private String solicitaExames;

    @Column(name = "procedimento")
    private String procedimento;

    @Column(name = "medicamentos")
    private String medicamentos;

    @Column(name = "data")
    private Date data;

}
