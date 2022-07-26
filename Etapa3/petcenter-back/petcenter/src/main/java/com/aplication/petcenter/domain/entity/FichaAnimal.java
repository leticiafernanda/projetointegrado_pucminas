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
@Table(name = "FichaAnimal")
public class FichaAnimal implements Serializable {

    private static final long serialVersionUID = 5118809257133340942L;

    @Id
    @Column(name = "id_ficha_animal")
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_cliente", nullable = false)
    private Cliente proprietario;

    @OneToOne
    @JoinColumn(name="id_animal", nullable = false)
    private Animal animal;

    @OneToOne
    @JoinColumn(name="id_medico", nullable = false)
    private Medico medico;

    @Column(name = "exames", nullable = false)
    private String exames;

    @Column(name = "solicita_exames")
    private String solicitaExames;

    @Column(name = "procedimento")
    private String procedimento;

    @Column(name = "medicamentos")
    private String medicamentos;

    @Column(name = "data")
    private Date data;

}
