package com.aplication.petcenter.service.impl;

import com.aplication.petcenter.repository.AgendamentoRepository;
import com.aplication.petcenter.repository.FichaAnimalRepository;
import com.aplication.petcenter.service.AgendamentoService;
import com.aplication.petcenter.service.FichaAnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FichaAnimalServiceImpl implements FichaAnimalService {

    private final FichaAnimalRepository fichaAnimalRepository;
}
