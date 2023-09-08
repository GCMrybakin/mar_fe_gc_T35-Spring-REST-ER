package com.mrybakin.tarea35.Ejercicio3.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea35.Ejercicio3.dto.Almacenes;
import com.mrybakin.tarea35.Ejercicio3.service.IAlmacenesService;
import com.mrybakin.tarea35.Ejercicio3.service.AlmacenesServiceImplementation;

@RestController
@RequestMapping("/api/Almacenes")
public class AlmacenesController {

    @Autowired
    private AlmacenesServiceImplementation AlmacenesService;

    @GetMapping
    public List<Almacenes> listarAlmacenes() {
        return AlmacenesService.listarAlmacenes();
    }

    @GetMapping("/{codigo}")
    public Almacenes mostrarDepartamentoPorCodigo(@PathVariable int codigo) {
        return AlmacenesService.mostrarAlmacenesID(codigo);
    }

    @PostMapping
    public Almacenes guardarDepartamento(@RequestBody Almacenes Departamento) {
        return AlmacenesService.guardarAlmacen(Departamento);
    }

    @PutMapping("/{codigo}")
    public Almacenes actualizarDepartamento(@PathVariable int codigo, @RequestBody Almacenes Almacenes) {
    	Almacenes AlmacenSel = new Almacenes();
		Almacenes AlmacenAct = new Almacenes();
		AlmacenSel = AlmacenesService.mostrarAlmacenesID(codigo);
		AlmacenSel.setLugar(Almacenes.getLugar());
		AlmacenSel.setCapacidad(Almacenes.getCapacidad());
		
		AlmacenAct = AlmacenesService.actualizarAlmacen(AlmacenSel);
		return AlmacenAct;
    }

    @DeleteMapping("/{codigo}")
    public void eliminarDepartamento(@PathVariable int codigo) {
        AlmacenesService.eliminarAlmacen(codigo);
    }
}

