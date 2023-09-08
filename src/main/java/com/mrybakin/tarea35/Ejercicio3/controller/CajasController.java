package com.mrybakin.tarea35.Ejercicio3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea35.Ejercicio3.dto.Cajas;
import com.mrybakin.tarea35.Ejercicio3.service.ICajasService;
import com.mrybakin.tarea35.Ejercicio3.service.CajasServiceImplementation;

@RestController
@RequestMapping("/api/Cajas")
public class CajasController {

    @Autowired
    private CajasServiceImplementation CajasService;

    @GetMapping
    public List<Cajas> listarCajas() {
        return CajasService.listarCajas();
    }

    @GetMapping("/{codigo}")
    public Cajas mostrarDepartamentoPorCodigo(@PathVariable String referencia) {
        return CajasService.mostrarCajasID(referencia);
    }

    @PostMapping("/cajas")
	public Cajas guardarCaja(@RequestBody Cajas departamentos) {
		return CajasService.guardarCaja(departamentos);
	}

    @PutMapping("/{codigo}")
    public Cajas actualizarCaja(@PathVariable(name="codigo") String referencia, @RequestBody Cajas cajas) {
    	Cajas CajaSel = new Cajas();
		Cajas CajaAct = new Cajas();
		CajaSel = CajasService.mostrarCajasID(referencia);
		CajaSel.setContenido(cajas.getContenido());
		CajaSel.setValor(cajas.getValor());
		CajaSel.setAlmacenes(cajas.getAlmacenes());
		
		CajaAct = CajasService.actualizarCaja(CajaSel);
		return CajaAct;
    }

    @DeleteMapping("/cajas/{codigo}")
	public void eliminarCaja(@PathVariable(name="codigo") String referencia) {
    	CajasService.eliminarCaja(referencia);
	}
}


