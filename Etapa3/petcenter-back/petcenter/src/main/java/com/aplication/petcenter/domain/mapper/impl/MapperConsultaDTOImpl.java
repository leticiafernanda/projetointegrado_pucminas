package com.aplication.petcenter.domain.mapper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aplication.petcenter.domain.dto.AgendamentoBasicDTO;
import com.aplication.petcenter.domain.dto.AnimalDTO;
import com.aplication.petcenter.domain.dto.ClienteDTO;
import com.aplication.petcenter.domain.dto.ConsultaDTO;
import com.aplication.petcenter.domain.dto.MedicoDTO;
import com.aplication.petcenter.domain.dto.ServicosDTO;
import com.aplication.petcenter.domain.entity.Animal;
import com.aplication.petcenter.domain.entity.Cliente;
import com.aplication.petcenter.domain.entity.Consulta;
import com.aplication.petcenter.domain.entity.Funcionario;
import com.aplication.petcenter.domain.entity.Medico;
import com.aplication.petcenter.domain.mapper.MapperAnimalDTO;
import com.aplication.petcenter.domain.mapper.MapperClienteDTO;
import com.aplication.petcenter.domain.mapper.MapperConsultaDTO;
import com.aplication.petcenter.domain.mapper.MapperMedicoDTO;

import lombok.RequiredArgsConstructor;
import lombok.var;

@Component
@RequiredArgsConstructor
public class MapperConsultaDTOImpl implements MapperConsultaDTO {

    private final MapperClienteDTO mapperClienteDTO;
    private final MapperAnimalDTO mapperAnimalDTO;

    @Override
    public ConsultaDTO execute(Consulta consulta) {
        return ConsultaDTO.builder()
                .id(consulta.getId())
                .data(consulta.getData())
                .horario(consulta.getHorario())
                .pedido(consulta.getPedido())
                .custo(consulta.getCusto())
                .cliente(getProprietario(consulta))
                .animal(getAnimal(consulta))
                .medico(getMedico(consulta))
                .servicos(getServicos(consulta))
                .statusConsulta(consulta.getStatusConsulta())
                .build();

    }
    
	public Consulta execute(AgendamentoBasicDTO agendamento) {
		 return Consulta.builder()
				 .id(agendamento.getId())
				 .data(agendamento.getData())
				 .horario(agendamento.getHora())
				 .cliente(clienteId(agendamento.getIdProprietario()))
				 .animal(animalId(agendamento.getIdAnimal()))
				 .medico(medicoId(agendamento.getIdMedico()))
				 .statusConsulta("Marcado")
				 .custo(100.00)
				 .pedido("Indefinido")
				 .build();
		 
	}
    private Funcionario medicoId(Integer idMedico) {
    	return Medico.builder()
				.id(idMedico)
				.build();
	}

	private Animal animalId(Integer idAnimal) {
		return Animal.builder()
				.id(idAnimal)
				.build();
	}

	private Cliente clienteId(Integer idProprietario) {
		return Cliente.builder()
				.id(idProprietario)
				.build();
	}

	private ClienteDTO getProprietario(Consulta consulta) {
        return consulta.getCliente() != null
                ? mapperClienteDTO.execute(consulta.getCliente())
                : null;
    }
    private AnimalDTO getAnimal(Consulta consulta) {
        return consulta.getAnimal() != null
                ? mapperAnimalDTO.execute(consulta.getAnimal())
                : null;
    }
    private MedicoDTO getMedico(Consulta consulta) {
    	return MedicoDTO.builder()
				.id(consulta.getMedico().getId())
				.nome(consulta.getMedico().getNome())
				.endereco(consulta.getMedico().getEndereco())
				.telefoneCasa(consulta.getMedico().getTelefoneCasa())
				.telefoneCelular(consulta.getMedico().getTelefoneCelular())				
				.build();
    }

    private List<ServicosDTO> getServicos(Consulta consulta) {
        var consultas = ServicosDTO.builder()
                .id(consulta.getId())
                .build();

        return Collections.singletonList(consultas);
    }

}
