package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class EmpleadoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombre;
	private int edad;
	private double salario;
	private int id;

	
    public EmpleadoDTO (int id, String nombre, int edad, double salario) {
    	this.id = id;
    	this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		
	}
    
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Id:"+this.id + "\nNombre:"+this.nombre+"\nEdad:"+this.edad+"\nSalario:"+this.salario;
	}
}