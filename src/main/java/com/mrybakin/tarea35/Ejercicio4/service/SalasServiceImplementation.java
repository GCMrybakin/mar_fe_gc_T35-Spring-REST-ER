package com.mrybakin.tarea35.Ejercicio4.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mrybakin.tarea35.Ejercicio4.dao.SalasRepository;
import com.mrybakin.tarea35.Ejercicio4.dto.Salas;
import com.mrybakin.tarea35.Ejercicio4.service.ISalasService;

@Service
public class SalasServiceImplementation implements ISalasService {
	@Autowired
	SalasRepository SalasRepo;

	@Override
	public List<Salas> listarSalas() {
		// TODO Auto-generated method stub
		return SalasRepo.findAll();
	}

	@Override
	public Salas mostrarSalasID(int id) {
		// TODO Auto-generated method stub
		return SalasRepo.findById(id).get();
	}

	@Override
	public Salas guardarSala(Salas salas) {
		// TODO Auto-generated method stub
		return SalasRepo.save(salas);
	}

	@Override
	public Salas actualizarSala(Salas salas) {
		// TODO Auto-generated method stub
		return SalasRepo.save(salas);
	}

	@Override
	public void eliminarSala(int id) {
		// TODO Auto-generated method stub
		SalasRepo.deleteById(id);
	}
	
}
