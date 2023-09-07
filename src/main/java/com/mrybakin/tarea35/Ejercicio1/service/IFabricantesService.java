package com.mrybakin.tarea35.Ejercicio1.service;
import java.util.List;
import com.mrybakin.tarea35.Ejercicio1.dto.Fabricantes;
public interface IFabricantesService {
		public List<Fabricantes> listarFabricantes();
		public Fabricantes mostrarFabricantesID(int id);
		public Fabricantes guardarFabricantes(Fabricantes fabricantes);
		public Fabricantes actualizarFabricantes(Fabricantes fabricantes);
		public void eliminarFabricantes(int id);
}