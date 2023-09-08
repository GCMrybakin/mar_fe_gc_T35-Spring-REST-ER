package com.mrybakin.tarea35.Ejercicio4.service;
import java.util.List;
import com.mrybakin.tarea35.Ejercicio4.dto.Salas;

public interface ISalasService {
	public List<Salas> listarSalas();
	public Salas mostrarSalasID(int id);
	public Salas guardarSala(Salas salas);
	public Salas actualizarSala(Salas salas);
	public void eliminarSala(int id);

}
