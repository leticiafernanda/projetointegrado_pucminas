package com.aplication.petcenter.domain.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Vacina")
public class Vacina implements Serializable {

    private static final long serialVersionUID = 1816527773309623218L;

    @Id
    @Column(name = "id")
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



    public Vacina() {
    }
    public Vacina(Integer id, String nome, Date validade, Date fabricacao, String lote) {
        super();
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.fabricacao = fabricacao;
        this.lote = lote;
    }
}
