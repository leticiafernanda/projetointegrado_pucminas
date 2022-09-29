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
public class ConsultaBasicDTO implements Serializable {

	private static final long serialVersionUID = -4373598965345612757L;
	
	private  Integer id;
    private String statusConsulta;
}
