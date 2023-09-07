package com.mrybakin.tarea35.Ejercicio2.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrybakin.tarea35.Ejercicio2.dto.Empleados;
import com.mrybakin.tarea35.Ejercicio2.dao.EmpleadosRepository;

public abstract class EmpleadosServiceImplementation implements IEmpleadosService {
	
	@Autowired
	EmpleadosRepository EmpleadosRepo;

	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return EmpleadosRepo.findAll();
	}

	@Override
	public Empleados mostrarEmpleadosID(int id) {
		// TODO Auto-generated method stub
		return EmpleadosRepo.findById((long) id).get();
	}

	@Override
	public Empleados guardarEmpleados(Empleados Empleados) {
		// TODO Auto-generated method stub
		return EmpleadosRepo.save(Empleados);
	}

	@Override
	public Empleados actualizarEmpleados(Empleados Empleados) {
		// TODO Auto-generated method stub
		return EmpleadosRepo.save(Empleados);
	}

	@Override
	public void eliminarEmpleados(int id) {
		// TODO Auto-generated method stub
		EmpleadosRepo.deleteById((long) id);
	}

}
