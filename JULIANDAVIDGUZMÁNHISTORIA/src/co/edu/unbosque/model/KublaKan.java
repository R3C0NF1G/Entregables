package co.edu.unbosque.model;

public abstract class KublaKan {

	public int edad;
	
	public double estatura;
	
	public String colorojos;
	
	public String alma;

	public KublaKan(int edad, double estatura, String colorojos, String alma) {
		
		this.edad = edad;
		
		this.estatura = estatura;
		
		this.colorojos = colorojos;
		
		this.alma = alma;
	}
	
	abstract void habitar();
	
	abstract void sentir();

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getColorojos() {
		return colorojos;
	}

	public void setColorojos(String colorojos) {
		this.colorojos = colorojos;
	}

	public String getAlma() {
		return alma;
	}

	public void setAlma(String alma) {
		this.alma = alma;
	}
 
}