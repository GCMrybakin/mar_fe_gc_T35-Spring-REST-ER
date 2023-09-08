package com.mrybakin.tarea35.Ejercicio3.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mrybakin.tarea35.Ejercicio3.dto.Almacenes;


public interface AlmacenesRepository extends JpaRepository<Almacenes, Long> {
	
}
