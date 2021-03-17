package co.edu.unbosque.control;

import co.edu.unbosque.model.EjercicioArchivo;

public class Controller {
	
	EjercicioArchivo eA;
	
	public Controller() {
		
		eA = new EjercicioArchivo();
		eA.gestionarArchivoCadena();
	}

}
