package com.mrybakin.tarea35.Ejercicio1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrybakin.tarea35.Ejercicio1.dto.Articulos;
import com.mrybakin.tarea35.Ejercicio1.dao.ArticulosRepository;
@Service
public class ArticulosServiceImplementation implements IArticulosService {
	
	@Autowired
	ArticulosRepository ArticulosRepo;

	@Override
	public List<Articulos> listarArticulos() {
		// TODO Auto-generated method stub
		return ArticulosRepo.findAll();
	}

	@Override
	public Articulos mostrarArticulosID(int id) {
		// TODO Auto-generated method stub
		return ArticulosRepo.findById((long) id).get();
	}

	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return ArticulosRepo.save(articulo);
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return ArticulosRepo.save(articulo);
	}

	@Override
	public void eliminarArticulo(int id) {
		// TODO Auto-generated method stub
		ArticulosRepo.deleteById((long)id);
		
	}


}
