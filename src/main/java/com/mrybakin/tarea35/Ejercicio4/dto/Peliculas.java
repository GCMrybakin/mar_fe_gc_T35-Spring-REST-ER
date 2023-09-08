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
@Table(name="Peliculas") 
public class Peliculas {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="calificacion_edad")
	private int calificacionEdad;
	
	@OneToMany(mappedBy="peliculas")
	private List<Salas> salas;
	public Peliculas() {}
	
	public Peliculas(int codigo, String nombre, int calificacionEdad, List<Salas> salas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
		this.salas = salas;
	}
	
	@Override
	public String toString() {
		return "Peliculas codigo =" + codigo + ", nombre =" + nombre + ", calificacionEdad =" + calificacionEdad + ", salas=" + salas;
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

	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	public List<Salas> getSalas() {
		return salas;
	}

	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}

}
