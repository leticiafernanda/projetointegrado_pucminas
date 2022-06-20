package com.aplication.petcenter.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Vacina")
public class Vacina implements Serializable {

    private static final long serialVersionUID = 1816527773309623218L;

    @Id
    @Column(name = "id_vacina")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "validade")
    private Date validade;

    @Column(name = "fabricacao")
    private Date fabricacao;

    @Column(name = "lote")
    private String lote;

    @ManyToMany
    @JoinTable(name = "vacina_servicos",
            joinColumns = @JoinColumn(name = "vacina_id_vacina", referencedColumnName = "servicos_id_servico"))
    private List<Servicos> servicoses = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "vacina_servicos",
            joinColumns = @JoinColumn(name = "vacina_id_vacina", referencedColumnName = "servicos_id_servico"))
    private List<Servicos> servico = new ArrayList<>();

    public List<Servicos> getServico() {
        return servico;
    }

    public void setServico(List<Servicos> servico) {
        this.servico = servico;
    }

    public List<Servicos> getServicoses() {
        return servicoses;
    }

    public void setServicoses(List<Servicos> servicoses) {
        this.servicoses = servicoses;
    }
}
