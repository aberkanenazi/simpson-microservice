package com.esipe.tp.simpsonmicroservice.repository;

import com.esipe.tp.simpsonmicroservice.model.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnageRepository extends JpaRepository<Personnage,Long> {
}
