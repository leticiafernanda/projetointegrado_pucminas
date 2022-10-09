package com.aplication.petcenter.domain.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO implements Serializable {
 
	private static final long serialVersionUID = 7351643912483394438L;
	
    private  String email;
    private  String senha;
}
