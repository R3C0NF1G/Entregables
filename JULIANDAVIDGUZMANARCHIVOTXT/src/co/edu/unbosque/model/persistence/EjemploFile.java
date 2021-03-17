package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import co.edu.unbosque.model.Nombres;

public class EjemploFile {

	Nombres ns;
	
	public EjemploFile() {
		
		ns = new Nombres();
		
	}
	
public String archivodata = "./Data/datanumeros.txt";

	public int escribirArchivo (String dato) {
		
		File f = new File (this.archivodata);
		
		try {
			
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(f);
			
			fw.write(","+ns.arreglo[0]+"\n"+","+ns.arreglo[1]+"\n"+","+ns.arreglo[2]+"\n"+","+ns.arreglo[3]);
			
			
			pw.println(dato);
			
			fw.close();
		
		}catch (IOException e) {
			
			e.printStackTrace();
			
			return -1;
			
		}
		
		return 0;
		
	}

	public String leerArchivo() {
		
		String linea = "";
		String cadena = "";
		
		File f = new File (this.archivodata);
		
		try {
		
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			linea = br.readLine();
				
			for(int i = 0; i<ns.arreglo[0].length(); i++ ) {
				
				linea = linea.split(",")[0];
				
				cadena += linea;
				
				linea = br.readLine();
			}

			
			fr.close();
		
		}catch (IOException e) {
			
			return null;
			
		}
		
		return cadena;
		
	}
}