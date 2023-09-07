package com.mrybakin.tarea35.Ejercicio2.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "Empleados")
public class Empleados {
    @Id
    @Column(name="dni")
    private String dni;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="apellidos")
	private String apellidos;
    
    @ManyToOne
	@JoinColumn(name="departamento")
	private Departamentos departamentos;
    
    public Empleados() {}

    public Empleados(String dni, String nombre, String apellidos, Departamentos departamentos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamentos = departamentos;
	}


    public String toString() {
        return "Empleados dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", Departamento=" + departamentos + "";
    }

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

}
