package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class Nomina  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int horas;
	private String cedula;
	private String mes;
	
	public Nomina(String cedula, int horas, String mes ) {
		
		this.cedula = cedula;
		this.horas = horas;
		this.mes = mes;
	}
	

	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
	
    public String toString() {
		return "cedula:"+this.cedula +"\n Edad:"+this.mes+"\n Salario:"+this.horas;
 
    }
}