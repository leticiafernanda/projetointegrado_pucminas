package com.aplication.petcenter.domain.mapper.impl;

import com.aplication.petcenter.domain.dto.FuncionarioDTO;
import com.aplication.petcenter.domain.entity.Funcionario;
import com.aplication.petcenter.domain.mapper.MapperFuncionarioDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperFuncionarioDTOImpl implements MapperFuncionarioDTO {

    @Override
    public FuncionarioDTO execute(Funcionario funcionario) {
        return FuncionarioDTO.builder()
                .id(funcionario.getId())
                .nome(funcionario.getNome())
                .dataNascimento(funcionario.getDataNascimento())
                .email(funcionario.getEmail())
                .endereco(funcionario.getEndereco())
                .telefoneCasa(funcionario.getTelefoneCasa())
                .telefoneCelular(funcionario.getTelefoneCelular())
                .build();
    }
}
