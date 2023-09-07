package com.mrybakin.tarea35.Ejercicio2.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea35.Ejercicio2.dto.Empleados;
import com.mrybakin.tarea35.Ejercicio2.service.IDepartamentosService;
import com.mrybakin.tarea35.Ejercicio2.service.EmpleadosServiceImplementation;

@RestController
@RequestMapping("/api/Empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadosServiceImplementation EmpleadosService;

    @GetMapping
    public List<Empleados> listarEmpleados() {
        return EmpleadosService.listarEmpleados();
    }

    @GetMapping("/{codigo}")
    public Empleados mostrarEmpleadoPorCodigo(@PathVariable int codigo) {
        return EmpleadosService.mostrarEmpleadosID(codigo);
    }
    @PutMapping("/{codigo}")
    public Empleados actualizarEmpleado(@PathVariable int codigo, @RequestBody Empleados Empleado) {
    	Empleados Empleadoseleccionado = EmpleadosService.mostrarEmpleadosID(codigo);
    	
    	if (Empleadoseleccionado != null) {
    		Empleadoseleccionado.setNombre(Empleado.getNombre());
    		Empleadoseleccionado.setApellidos(Empleado.getApellidos());
    		Empleadoseleccionado.setDepartamentos(Empleado.getDepartamentos());
    		return EmpleadosService.actualizarEmpleados(Empleadoseleccionado);
    	} else {
    		return null;
    	}
    }

    @PostMapping
    public Empleados guardarEmpleado(@RequestBody Empleados Empleado) {
        return EmpleadosService.guardarEmpleados(Empleado);
    }


    @DeleteMapping("/{codigo}")
    public void eliminarEmpleado(@PathVariable int codigo) {
        EmpleadosService.eliminarEmpleados(codigo);
    }
}
