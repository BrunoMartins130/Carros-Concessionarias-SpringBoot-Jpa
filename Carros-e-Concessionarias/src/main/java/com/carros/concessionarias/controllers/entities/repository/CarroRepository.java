package com.carros.concessionarias.controllers.entities.repository;

import com.carros.concessionarias.controllers.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
