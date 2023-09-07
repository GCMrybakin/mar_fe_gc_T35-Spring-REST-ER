package com.mrybakin.tarea35.Ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea35.Ejercicio2.dto.Departamentos;
import com.mrybakin.tarea35.Ejercicio2.service.IDepartamentosService;
import com.mrybakin.tarea35.Ejercicio2.service.DepartamentosServiceImplementation;

@RestController
@RequestMapping("/api/Departamentos")
public class DepartamentosController {

    @Autowired
    private DepartamentosServiceImplementation DepartamentosService;

    @GetMapping
    public List<Departamentos> listarDepartamentos() {
        return DepartamentosService.listarDepartamentos();
    }

    @GetMapping("/{codigo}")
    public Departamentos mostrarDepartamentoPorCodigo(@PathVariable int codigo) {
        return DepartamentosService.mostrarDepartamentosID(codigo);
    }

    @PostMapping
    public Departamentos guardarDepartamento(@RequestBody Departamentos Departamento) {
        return DepartamentosService.guardarDepartamentos(Departamento);
    }

    @PutMapping("/{codigo}")
    public Departamentos actualizarDepartamento(@PathVariable int codigo, @RequestBody Departamentos Departamento) {
        Departamentos Departamentoseleccionado = DepartamentosService.mostrarDepartamentosID(codigo);
        Departamentoseleccionado.setNombre(Departamento.getNombre());
        return DepartamentosService.actualizarDepartamentos(Departamentoseleccionado);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarDepartamento(@PathVariable int codigo) {
        DepartamentosService.eliminarDepartamentos(codigo);
    }
}
