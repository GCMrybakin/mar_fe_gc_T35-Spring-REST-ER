package com.mrybakin.tarea35.Ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea35.Ejercicio1.dto.Fabricantes;
import com.mrybakin.tarea35.Ejercicio1.service.IFabricantesService;
import com.mrybakin.tarea35.Ejercicio1.service.FabricantesServiceImplementation;

@RestController
@RequestMapping("/api/fabricantes")
public class FabricantesController {

    @Autowired
    private FabricantesServiceImplementation fabricantesService;

    @GetMapping
    public List<Fabricantes> listarFabricantes() {
        return fabricantesService.listarFabricantes();
    }

    @GetMapping("/{codigo}")
    public Fabricantes mostrarFabricantePorCodigo(@PathVariable int codigo) {
        return fabricantesService.mostrarFabricantesID(codigo);
    }

    @PostMapping
    public Fabricantes guardarFabricante(@RequestBody Fabricantes fabricante) {
        return fabricantesService.guardarFabricantes(fabricante);
    }

    @PutMapping("/{codigo}")
    public Fabricantes actualizarFabricante(@PathVariable int codigo, @RequestBody Fabricantes fabricante) {
        Fabricantes fabricanteSeleccionado = fabricantesService.mostrarFabricantesID(codigo);
        fabricanteSeleccionado.setNombre(fabricante.getNombre());
        return fabricantesService.actualizarFabricantes(fabricanteSeleccionado);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarFabricante(@PathVariable int codigo) {
        fabricantesService.eliminarFabricantes(codigo);
    }
}
