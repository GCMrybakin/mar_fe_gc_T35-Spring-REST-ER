package com.mrybakin.tarea35.Ejercicio2.service;
import java.util.List;
import com.mrybakin.tarea35.Ejercicio2.dto.Departamentos;
public interface IDepartamentosService {
		public List<Departamentos> listarDepartamentos();
		public Departamentos mostrarDepartamentosID(int id);
		public Departamentos guardarDepartamentos(Departamentos Departamentos);
		public Departamentos actualizarDepartamentos(Departamentos Departamentos);
		public void eliminarDepartamentos(int id);
}
