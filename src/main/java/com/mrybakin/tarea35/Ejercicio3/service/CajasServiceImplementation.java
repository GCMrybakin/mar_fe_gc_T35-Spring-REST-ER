package com.mrybakin.tarea35.Ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrybakin.tarea35.Ejercicio2.dao.DepartamentosRepository;
import com.mrybakin.tarea35.Ejercicio3.dao.CajasRepository;
import com.mrybakin.tarea35.Ejercicio3.dto.Cajas;

public class CajasServiceImplementation implements ICajasService {
	
	@Autowired
	CajasRepository CajasRepo;

	@Override
	public List<Cajas> listarCajas() {
		// TODO Auto-generated method stub
		return CajasRepo.findAll();
	}

	public Cajas mostrarCajasID(String NumReferencia) {
		// TODO Auto-generated method stub
		return CajasRepo.findById(NumReferencia).get();
	}

	@Override
	public Cajas guardarCaja(Cajas caja) {
		// TODO Auto-generated method stub
		return CajasRepo.save(caja);
	}

	@Override
	public Cajas actualizarCaja(Cajas caja) {
		// TODO Auto-generated method stub
		return CajasRepo.save(caja);
	}

	@Override
	public void eliminarCaja(String referencia) {
		// TODO Auto-generated method stub
		CajasRepo.deleteById(referencia);;
	}


}
