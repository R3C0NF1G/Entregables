package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Propiedades {

	private Properties prop=new Properties();
	
	String archivoprop="./Config/archivo.properties";
	
	public int escribirPropiedades() {
		
		try {
			prop.setProperty("NombreProyecto ", "Archivos de texto");
			prop.setProperty("TipoArchivo ", "Texto y propiedades");
			prop.setProperty("NombreArchivo ", "archivo.properties");
			prop.store(new FileOutputStream(archivoprop), null);
			
		}catch(IOException ioex) {
		
		return -1;
			
		}
		
		return 0;
	}
	public String leerPropiedades() {
		
		String linea="";
		
		try {
			
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			linea+="Nombre del proyecto: "+prop.getProperty("NombreProyecto"+"\n");
			linea+="Tipo de archivo: "+prop.getProperty("TipoArchivo"+"\n");
			linea+="Nombre del archivo: "+prop.getProperty("NombreArchivo"+"\n");
			
		}catch(IOException ioex) {
			
			return null;
		}
		
		return linea;
		
	}
}