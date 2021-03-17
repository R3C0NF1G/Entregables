package co.edu.unbosque.model;

public class Kira extends KublaKan{
	
	public Kira(int edad, double estatura, String colorojos, String alma) {
		super(edad, estatura, colorojos, alma);
		
		this.estatura = 3.00;
		// TODO Auto-generated constructor stub
	}

	public String volar() {
		
		return "Sobre vuelo este planeta en busca de oficios.";
	}
	
	public String crearFuego() {
		
		return "¿Se te ofrece un show de Magía?";
	}
	
	public String detenerTiempo() {
		
		return "tengo el poder sobre los relojes.";
	}
	
	@Override
	void habitar() {
		// TODO Auto-generated method stub
		
		System.out.println("Habito al norte del planeta.");
	}

	@Override
	void sentir() {
		// TODO Auto-generated method stub
		
		System.out.println("Me siento a mí misma y a otros seres de otros mundos.");
		
	}
}
