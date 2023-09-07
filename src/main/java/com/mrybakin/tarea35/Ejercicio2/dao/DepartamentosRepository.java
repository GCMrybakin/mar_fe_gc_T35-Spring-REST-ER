package com.mrybakin.tarea35.Ejercicio2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mrybakin.tarea35.Ejercicio2.dto.Departamentos;


public interface DepartamentosRepository extends JpaRepository<Departamentos, Long> {
	
}