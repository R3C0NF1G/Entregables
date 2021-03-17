package co.edu.unbosque.controller;

import co.edu.unbosque.model.Libro;
import co.edu.unbosque.view.Vista;

public class Control {

	Libro lb;
	Vista vie;
	
	public Control() {
		
		lb = new Libro();
		vie = new Vista();
		vie.mostrarNota();	}
}
