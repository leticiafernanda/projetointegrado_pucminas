package com.aplication.petcenter.repository;

import com.aplication.petcenter.domain.entity.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos, Integer> {
}