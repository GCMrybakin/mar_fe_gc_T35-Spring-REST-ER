package com.mrybakin.tarea35.Ejercicio1.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "Articulos")
public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private int precio;
    @ManyToOne
    @Column(name = "Fabricante")
    private Fabricantes Fabricante;
    
    public Articulos() {}

    public Articulos(Long id, String nombre, int precio, Fabricantes Fabricante) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.Fabricante = Fabricante;
	}


    public String toString() {
        return "Articulo id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", Fabricante=" + Fabricante + "";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricantes getFabricante() {
		return Fabricante;
	}

	public void setFabricante(Fabricantes fabricante) {
		Fabricante = fabricante;
	}
}
