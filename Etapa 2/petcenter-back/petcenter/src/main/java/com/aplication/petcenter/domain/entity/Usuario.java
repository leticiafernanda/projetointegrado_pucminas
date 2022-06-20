package com.aplication.petcenter.domain.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import com.aplication.petcenter.domain.entity.TipoPermissão;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Usuario")
public abstract class Usuario implements Serializable {

    private static final long serialVersionUID = 1816527773309623218L;

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "senha", unique = true)
    private String senha;

    @OneToMany
    @JoinColumn(name = "permissao", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private TipoPermissão tipo;

}