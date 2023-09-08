package com.mrybakin.tarea35.Ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.mrybakin.tarea35.Ejercicio3.dto.Almacenes;
import com.mrybakin.tarea35.Ejercicio3.dao.AlmacenesRepository;
import com.mrybakin.tarea35.Ejercicio3.service.IAlmacenesService;

public class AlmacenesServiceImplementation implements IAlmacenesService {
	
	@Autowired
	AlmacenesRepository AlmacenesRepo;

	@Override
	public List<Almacenes> listarAlmacenes() {
		// TODO Auto-generated method stub
		return AlmacenesRepo.findAll();
	}

	@Override
	public Almacenes mostrarAlmacenesID(int id) {
		// TODO Auto-generated method stub
		return AlmacenesRepo.findById((long) id).get();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return AlmacenesRepo.save(almacen);
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return AlmacenesRepo.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int id) {
		// TODO Auto-generated method stub
		AlmacenesRepo.deleteById((long) id);
	}

}
