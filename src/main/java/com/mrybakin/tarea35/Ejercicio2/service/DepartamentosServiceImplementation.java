package com.mrybakin.tarea35.Ejercicio2.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrybakin.tarea35.Ejercicio2.dto.Departamentos;
import com.mrybakin.tarea35.Ejercicio2.dao.DepartamentosRepository;
@Service
public abstract class DepartamentosServiceImplementation implements IDepartamentosService {
	
	@Autowired
	DepartamentosRepository DepartamentosRepo;

	@Override
	public List<Departamentos> listarDepartamentos() {
		// TODO Auto-generated method stub
		return DepartamentosRepo.findAll();
	}

	@Override
	public Departamentos mostrarDepartamentosID(int id) {
		// TODO Auto-generated method stub
		return DepartamentosRepo.findById((long) id).get();
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos Departamentos) {
		// TODO Auto-generated method stub
		return DepartamentosRepo.save(Departamentos);
	}

	@Override
	public Departamentos actualizarDepartamentos(Departamentos Departamentos) {
		// TODO Auto-generated method stub
		return DepartamentosRepo.save(Departamentos);
	}

	@Override
	public void eliminarDepartamentos(int id) {
		// TODO Auto-generated method stub
		DepartamentosRepo.deleteById((long)id);
		
	}

}
