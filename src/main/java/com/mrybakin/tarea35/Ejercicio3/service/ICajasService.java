package com.mrybakin.tarea35.Ejercicio3.service;

import java.util.List;
import com.mrybakin.tarea35.Ejercicio3.dto.Cajas;

public interface ICajasService {

	public List<Cajas> listarCajas();
	public Cajas mostrarCajasID(String referencia);
	public Cajas guardarCaja(Cajas almacen);
	public Cajas actualizarCaja(Cajas almacen);
	public void eliminarCaja(String referencia);
}