package com.aplication.petcenter.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class FichaAnimalDto implements Serializable {
    private final Integer id;
    private final ClienteDto proprietario;
    private final AnimalDto animal;
    private final MedicoDto medico;
    private final String exames;
    private final String solicitaExames;
    private final String procedimento;
    private final String medicamentos;
    private final Date data;
}
