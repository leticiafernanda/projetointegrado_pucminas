package com.aplication.petcenter.repository;

import com.aplication.petcenter.domain.entity.FichaAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichaAnimalRepository extends JpaRepository<FichaAnimal, Integer> {
}