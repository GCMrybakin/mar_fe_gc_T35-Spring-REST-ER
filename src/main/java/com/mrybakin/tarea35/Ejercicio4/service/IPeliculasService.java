package com.mrybakin.tarea35.Ejercicio4.service;
import java.util.List;
import com.mrybakin.tarea35.Ejercicio4.dto.Peliculas;

public interface IPeliculasService {
	public List<Peliculas> listarPeliculas();
	public Peliculas mostrarPeliculasID(int id);
	public Peliculas guardarPelicula(Peliculas Peliculas);
	public Peliculas actualizarPelicula(Peliculas Peliculas);
	public void eliminarPelicula(int id);
}
