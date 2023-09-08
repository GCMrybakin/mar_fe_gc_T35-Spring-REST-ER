package com.mrybakin.tarea35.Ejercicio4.dto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="Salas") 
public class Salas {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="pelicula")
	Peliculas peliculas;
	public Salas() {}
	public Salas(int codigo, String nombre, Peliculas peliculas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.peliculas = peliculas;
	}
	@Override
	public String toString() {
		return "Salas codigo =" + codigo + ", nombre =" + nombre + ", peliculas =" + peliculas;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Peliculas getPeliculas() {
		return peliculas;
	}
	public void setSalas(Peliculas peliculas) {
		this.peliculas = peliculas;
	}
	


}
