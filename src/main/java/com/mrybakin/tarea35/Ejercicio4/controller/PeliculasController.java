package com.mrybakin.tarea35.Ejercicio4.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea35.Ejercicio4.dto.Peliculas;
import com.mrybakin.tarea35.Ejercicio4.service.IPeliculasService;
import com.mrybakin.tarea35.Ejercicio4.service.PeliculasServiceImplementation;
@RestController
@RequestMapping("/api")
public class PeliculasController {
	@Autowired
	PeliculasServiceImplementation peliculasService;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return peliculasService.listarPeliculas();
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Peliculas mostrarPeliculasID(@PathVariable(name="codigo") int codigo) {
		return peliculasService.mostrarPeliculasID(codigo);
	}
	@PostMapping("/peliculas")
	public Peliculas guardarPelicula(@RequestBody Peliculas peliculas) {
		return peliculasService.guardarPelicula(peliculas);
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Peliculas actualizarPelicula(@PathVariable(name="codigo") int codigo, @RequestBody Peliculas peliculas) {
		Peliculas PeliculaSel = new Peliculas();
		Peliculas PeliculaAct = new Peliculas();
		PeliculaSel = peliculasService.mostrarPeliculasID(codigo);
		PeliculaSel.setNombre(peliculas.getNombre());
		PeliculaSel.setCalificacionEdad(peliculas.getCalificacionEdad());
		
		PeliculaAct = peliculasService.actualizarPelicula(PeliculaSel);
		return PeliculaAct;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name="codigo") int codigo) {
		peliculasService.eliminarPelicula(codigo);
	}

}
