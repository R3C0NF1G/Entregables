package co.edu.unbosque.control;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.Vista;

public class Controller {

	CynusX1 cy;
	Vista gui;
	
	public Controller() {
		
	gui = new Vista();
	gui.mostrar();
	cy = new CynusX1();
	cy.dioses();
	cy.desterrado();
	cy.mortal();
	 
	}
}