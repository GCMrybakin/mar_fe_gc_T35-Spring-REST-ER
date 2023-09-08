package com.mrybakin.tarea35.Ejercicio4.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mrybakin.tarea35.Ejercicio4.dao.PeliculasRepository;
import com.mrybakin.tarea35.Ejercicio4.dto.Peliculas;
import com.mrybakin.tarea35.Ejercicio4.service.IPeliculasService;
@Service
public class PeliculasServiceImplementation implements IPeliculasService {
	@Autowired
	PeliculasRepository PeliculasRepo;

	@Override
	public List<Peliculas> listarPeliculas() {
		// TODO Auto-generated method stub
		return PeliculasRepo.findAll();
	}

	@Override
	public Peliculas mostrarPeliculasID(int id) {
		// TODO Auto-generated method stub
		return PeliculasRepo.findById(id).get();
	}

	@Override
	public Peliculas guardarPelicula(Peliculas Peliculas) {
		// TODO Auto-generated method stub
		return PeliculasRepo.save(Peliculas);
	}

	@Override
	public Peliculas actualizarPelicula(Peliculas Peliculas) {
		// TODO Auto-generated method stub
		return PeliculasRepo.save(Peliculas);
	}

	@Override
	public void eliminarPelicula(int id) {
		// TODO Auto-generated method stub
		PeliculasRepo.deleteById(id);
	}

}
