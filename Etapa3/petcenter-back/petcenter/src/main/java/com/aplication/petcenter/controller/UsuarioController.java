package com.aplication.petcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Usuario;
import com.aplication.petcenter.domain.entity.Enum.Status;
import com.aplication.petcenter.domain.entity.Enum.TipoPermissão;
import com.aplication.petcenter.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;
import lombok.var;

@RestController
@RequestMapping("/v1/usuario")
@RequiredArgsConstructor
@Validated
public class UsuarioController {
	 @Autowired
	    UsuarioRepository usuarioRepository;
	    @PostMapping("/register")
	    public Status registerUser(@RequestBody Usuario newUser) {
	        List<Usuario> users = usuarioRepository.findAll();
	        for (Usuario user : users) {
	            if (user.equals(newUser)) {
	                return Status.USER_ALREADY_EXISTS;
	            }
	        }
	        usuarioRepository.save(newUser);
	        return Status.SUCCESS;
	    }
	    @PostMapping("/login")
	    public TipoPermissão loginUser(@RequestBody UsuarioDTO user) {
	    	String email = user.getEmail();
	    	String senha = user.getSenha();     

	        Usuario users = usuarioRepository.findByEmailAndSenha(email,senha);
	        if(users != null) {     
	            if (email.equals(users.getEmail()) && senha.equals(users.getSenha())) {
	            	var tipo = users.getTipo();
	                return tipo;
	            }
	        }
	        
	        return null;
	    }
	    @PostMapping("/logout")
	    public Status logoutUser(@RequestBody UsuarioDTO user) {
	    	String email = user.getEmail();
	    	String senha = user.getSenha();     

	        Usuario users = usuarioRepository.findByEmailAndSenha(email,senha);
	        if(users != null) {     
	            if (email.equals(users.getEmail()) && senha.equals(users.getSenha())) {
	                return Status.SUCCESS;
	            }
	        }
	        return Status.FAILURE;
	    }
	    @DeleteMapping("/all")
	    public Status deleteUsers() {
	        usuarioRepository.deleteAll();
	        return Status.SUCCESS;
	    }
}
