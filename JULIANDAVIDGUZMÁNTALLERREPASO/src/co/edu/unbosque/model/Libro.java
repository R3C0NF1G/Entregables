package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Libro {
	
	Alfabeto alf;
	Calendario cal;
	Directorio dir;
	
	public Libro() {
		
		alf = new Alfabeto();
		cal = new Calendario();
		dir = new Directorio();
		alf.alfabetoa();
		cal.calendarioc();
		dir.directoriod();
		
	}
}
