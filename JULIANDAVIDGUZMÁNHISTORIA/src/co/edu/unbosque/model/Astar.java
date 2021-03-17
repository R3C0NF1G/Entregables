package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Astar extends KublaKan{
	
	public Astar(int edad, double estatura, String colorojos, String alma) {
		super(edad, estatura, colorojos, alma);
		
		this.estatura = 3.00;
		// TODO Auto-generated constructor stub
	}

	public String volar() {
			
		return "Volar es lo que más me gusta.";
	}
	
	public String crearFuego() {
		
		return "puedo hacerte sudar con el fuego que sale de mis manos.";
	}
	
	public String detenerTiempo() {
		 
		return "Puedo detener el tiempo y te lo demostraré: Daré espera a mis labores, pues quiero descansar.";
	}
	@Override
	void habitar() {
		// TODO Auto-generated method stub
		
		System.out.println("Habito al norte del planeta.");
		
	}

	@Override
	void sentir() {
		// TODO Auto-generated method stub
		
		System.out.println("Me siento a mí mismo y a otros seres de otros mundos.");
		
	}
}