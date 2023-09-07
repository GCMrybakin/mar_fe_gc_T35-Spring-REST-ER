package com.mrybakin.tarea35.Ejercicio1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mrybakin.tarea35.Ejercicio1.dto.Articulos;
import com.mrybakin.tarea35.Ejercicio1.dto.Fabricantes;


public interface ArticulosRepository extends JpaRepository<Articulos, Long> {
	
}