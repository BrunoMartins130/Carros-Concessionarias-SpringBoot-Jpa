package com.carros.concessionarias.repository;

import com.carros.concessionarias.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
