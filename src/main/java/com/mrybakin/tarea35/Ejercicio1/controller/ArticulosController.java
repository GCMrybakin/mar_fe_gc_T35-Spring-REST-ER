package com.mrybakin.tarea35.Ejercicio1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea35.Ejercicio1.dto.Articulos;
import com.mrybakin.tarea35.Ejercicio1.service.IArticulosService;
import com.mrybakin.tarea35.Ejercicio1.service.ArticulosServiceImplementation;

@RestController
@RequestMapping("/api/articulos")
public class ArticulosController {

    @Autowired
    private ArticulosServiceImplementation articulosService;

    @GetMapping
    public List<Articulos> listarArticulos() {
        return articulosService.listarArticulos();
    }

    @GetMapping("/{codigo}")
    public Articulos mostrarArticuloPorCodigo(@PathVariable int codigo) {
        return articulosService.mostrarArticulosID(codigo);
    }
    @PutMapping("/{codigo}")
    public Articulos actualizarArticulo(@PathVariable int codigo, @RequestBody Articulos articulo) {
    	Articulos articuloSeleccionado = articulosService.mostrarArticulosID(codigo);
    	
    	if (articuloSeleccionado != null) {
    		articuloSeleccionado.setNombre(articulo.getNombre());
    		articuloSeleccionado.setPrecio(articulo.getPrecio());
    		return articulosService.actualizarArticulo(articuloSeleccionado);
    	} else {
    		return null;
    	}
    }

    @PostMapping
    public Articulos guardarArticulo(@RequestBody Articulos articulo) {
        return articulosService.guardarArticulo(articulo);
    }


    @DeleteMapping("/{codigo}")
    public void eliminarArticulo(@PathVariable int codigo) {
        articulosService.eliminarArticulo(codigo);
    }
}
