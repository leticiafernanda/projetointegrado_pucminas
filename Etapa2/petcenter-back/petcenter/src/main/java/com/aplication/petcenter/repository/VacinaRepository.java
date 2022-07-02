package com.aplication.petcenter.repository;

import com.aplication.petcenter.domain.entity.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Integer> {
}