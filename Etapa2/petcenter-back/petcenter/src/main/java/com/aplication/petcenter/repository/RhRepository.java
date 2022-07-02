package com.aplication.petcenter.repository;

import com.aplication.petcenter.domain.entity.Rh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RhRepository extends JpaRepository<Rh, Integer> {
}