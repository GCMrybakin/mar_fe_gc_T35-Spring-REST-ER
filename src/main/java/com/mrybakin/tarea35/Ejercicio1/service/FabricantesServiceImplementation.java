package com.mrybakin.tarea35.Ejercicio1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrybakin.tarea35.Ejercicio1.dto.Fabricantes;
import com.mrybakin.tarea35.Ejercicio1.dao.FabricantesRepository;
@Service
public class FabricantesServiceImplementation implements IFabricantesService {
	
	@Autowired
	FabricantesRepository FabricantesRepo;

	@Override
	public List<Fabricantes> listarFabricantes() {
		// TODO Auto-generated method stub
		return FabricantesRepo.findAll();
	}

	@Override
	public Fabricantes mostrarFabricantesID(int id) {
		// TODO Auto-generated method stub
		return FabricantesRepo.findById((long) id).get();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return FabricantesRepo.save(fabricantes);
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes) {
		// TODO Auto-generated method stub
		return FabricantesRepo.save(fabricantes);
	}

	@Override
	public void eliminarFabricantes(int id) {
		// TODO Auto-generated method stub
		FabricantesRepo.deleteById((long) id);
	}

}
