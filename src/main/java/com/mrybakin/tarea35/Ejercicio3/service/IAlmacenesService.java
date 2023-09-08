package com.mrybakin.tarea35.Ejercicio3.service;

import java.util.List;
import com.mrybakin.tarea35.Ejercicio3.dto.Almacenes;

public interface IAlmacenesService {

	public List<Almacenes> listarAlmacenes();
	public Almacenes mostrarAlmacenesID(int id);
	public Almacenes guardarAlmacen(Almacenes almacen);
	public Almacenes actualizarAlmacen(Almacenes almacen);
	public void eliminarAlmacen(int id);
}