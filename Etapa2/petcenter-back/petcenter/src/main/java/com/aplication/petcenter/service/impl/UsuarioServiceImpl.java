package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Usuario;
import com.aplication.petcenter.domain.mapper.MapperUsuarioDTO;
import com.aplication.petcenter.repository.UsuarioRepository;
import com.aplication.petcenter.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final MapperUsuarioDTO mapperUsuarioDTO;

    @Override
    public List<UsuarioDTO> findUsuarioList() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(mapperUsuarioDTO::execute).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Integer usuarioId) {
        usuarioRepository.deleteById(usuarioId);;
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
