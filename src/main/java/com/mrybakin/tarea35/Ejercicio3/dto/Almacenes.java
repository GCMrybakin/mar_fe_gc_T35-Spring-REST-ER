package com.mrybakin.tarea35.Ejercicio3.dto;
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
import com.mrybakin.tarea35.Ejercicio3.dto.Cajas;

@Entity
@Table(name="almacenes") 
public class Almacenes {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="lugar")
	private String lugar;
	
	@Column(name="capacidad")
	private int capacidad;

	@OneToMany(mappedBy="almacenes")
	private List<Cajas> cajas;
	
	public Almacenes() {}
	public Almacenes(int codigo, String lugar, int capacidad, List<Cajas> cajas) {
		super();
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.cajas = cajas;
	}
	
	public String toString() {
        return "Almacenes codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + ", cajas=" + cajas + "";
    }

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Cajas> getCajas() {
		return cajas;
	}
	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}
	
	
}
