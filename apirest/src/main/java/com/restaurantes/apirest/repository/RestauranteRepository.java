package com.restaurantes.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantes.apirest.models.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long>{
	
	Restaurante findById(long id);
	
}
