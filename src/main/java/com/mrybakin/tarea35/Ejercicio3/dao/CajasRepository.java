package com.mrybakin.tarea35.Ejercicio3.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mrybakin.tarea35.Ejercicio3.dto.Cajas;


public interface CajasRepository extends JpaRepository<Cajas, Long> {

	Optional<Cajas> findById(String numReferencia);

	void deleteById(String referencia);

	
}