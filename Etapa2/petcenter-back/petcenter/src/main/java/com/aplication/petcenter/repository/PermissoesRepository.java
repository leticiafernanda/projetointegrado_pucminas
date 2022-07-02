package com.aplication.petcenter.repository;

import com.aplication.petcenter.domain.entity.Permissoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissoesRepository extends JpaRepository<Permissoes, Integer> {
}