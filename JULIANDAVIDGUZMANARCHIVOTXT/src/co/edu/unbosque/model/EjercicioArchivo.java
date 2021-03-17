package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EjemploFile;

public class EjercicioArchivo {

	public String gestionarArchivoCadena() {
		
		EjemploFile archivo = new EjemploFile();
		
		archivo.escribirArchivo("Dato de tipo String");
		
		System.out.println("Arreglo guardado en el archivo txt.");
		
		return "leí ese dato: " + archivo.leerArchivo();
		
	}
}