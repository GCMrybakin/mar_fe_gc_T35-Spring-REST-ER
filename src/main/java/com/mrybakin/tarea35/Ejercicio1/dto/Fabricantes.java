package com.mrybakin.tarea35.Ejercicio1.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Fabricantes") 
public class Fabricantes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy="fabricante")
	private List<Articulos> articulos;
	
	public Fabricantes() {}
	
	public Fabricantes(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public String toString() {
        return "Fabricantes id=" + id + ", nombre=" + nombre + ", Articulos=" + articulos + "";
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Articulos> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}
}
