package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Registro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected String nombre;
	private int edad;
	private double salario;
	private String cedula;

	
	public Registro(String nombre, int edad, double salario, String cedula){
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.cedula = cedula;

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
	

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String toString() {
		return "Nombre:"+this.nombre+"\nEdad:"+this.edad+"\nSalario:"+this.salario;
	}
}