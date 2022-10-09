package com.aplication.petcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplication.petcenter.domain.dto.LoginDTO;
import com.aplication.petcenter.domain.dto.UsuarioDTO;
import com.aplication.petcenter.domain.entity.Usuario;
import com.aplication.petcenter.domain.entity.Enum.Status;
import com.aplication.petcenter.domain.entity.Enum.TipoPermissão;
import com.aplication.petcenter.repository.UsuarioRepository;
import com.aplication.petcenter.service.UsuarioService;

import lombok.RequiredArgsConstructor;
import lombok.var;

@RestController
@RequestMapping("/v1/usuario")
@RequiredArgsConstructor
@Validated
public class UsuarioController {
    private final UsuarioService usuarioService;

	 @Autowired
	    UsuarioRepository usuarioRepository;
	    @PostMapping("/register")
	    public ResponseEntity<Void> createUsario(@RequestBody UsuarioDTO usuario) {
	    	usuarioService.save(usuario);
	        return new ResponseEntity<>(HttpStatus.CREATED);
	    }    
	
	    @PostMapping("/login")
	    public TipoPermissão loginUser(@RequestBody LoginDTO user) {
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
	    public Status logoutUser(@RequestBody LoginDTO user) {
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
