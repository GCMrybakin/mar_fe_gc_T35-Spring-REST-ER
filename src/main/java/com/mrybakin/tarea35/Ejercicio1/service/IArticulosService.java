package com.mrybakin.tarea35.Ejercicio1.service;
import java.util.List;
import com.mrybakin.tarea35.Ejercicio1.dto.Articulos;
public interface IArticulosService {
		public List<Articulos> listarArticulos();
		public Articulos mostrarArticulosID(int id);
		public Articulos guardarArticulo(Articulos articulo);
		public Articulos actualizarArticulo(Articulos articulo);
		public void eliminarArticulo(int id);
}
