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
@Table(name="Cajas") 
public class Cajas {
	

	public Cajas(String numReferencia, String contenido, int valor, Almacenes almacenes) {
		super();
		NumReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacenes = almacenes;
	}

	@Id
	@Column(name="num_referencia")
	private String NumReferencia;
	
	@Column(name="contenido")
	private String contenido;
	
	@Column(name="valor")
	private int valor;

	@ManyToOne
	@JoinColumn(name="almacenes")
	Almacenes almacenes;
	
	public Cajas() {}
	
	
	
	public String toString() {
        return "Cajas NumReferencia=" + NumReferencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacenes + "";
    }



	public String getNumReferencia() {
		return NumReferencia;
	}



	public void setNumReferencia(String numReferencia) {
		NumReferencia = numReferencia;
	}



	public String getContenido() {
		return contenido;
	}



	public void setContenido(String contenido) {
		this.contenido = contenido;
	}



	public int getValor() {
		return valor;
	}



	public void setValor(int valor) {
		this.valor = valor;
	}



	public Almacenes getAlmacenes() {
		return almacenes;
	}



	public void setAlmacenes(Almacenes almacenes) {
		this.almacenes = almacenes;
	}

	
	
}
