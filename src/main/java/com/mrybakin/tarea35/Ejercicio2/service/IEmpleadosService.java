package com.mrybakin.tarea35.Ejercicio2.service;
import java.util.List;
import com.mrybakin.tarea35.Ejercicio2.dto.Empleados;
public interface IEmpleadosService {
		public List<Empleados> listarEmpleados();
		public Empleados mostrarEmpleadosID(int id);
		public Empleados guardarEmpleados(Empleados Empleados);
		public Empleados actualizarEmpleados(Empleados Empleados);
		public void eliminarEmpleados(int id);
}