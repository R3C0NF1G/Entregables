package co.edu.unbosque.model;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.ArchivoFile;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.view.View;

public class EjercicioArchivo {
	
	public String gestionarArchivoCadena(String dato,String ruta) {
		
		ArchivoFile archivo = new ArchivoFile();
		
		int proc=archivo.escribirArchivo(dato,ruta);
		
		if(proc==0) {
			
			JOptionPane.showMessageDialog(null, "Canción escrita en el archivo correctamente.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "La canción no ha sido escrita en el archivo.");
		}
		
		return ""+archivo.leerArchivo(ruta);
	}
	
	public String gestionarPropiedades() {
		
	Propiedades pr=new Propiedades();
	pr.escribirPropiedades();
	return pr.leerPropiedades();
}
	
	public String crearFrase() {
		
		String frase="";
		
		String palabras[][]={{"MAMI","YO QUIERO","ENCELDELTE","SUAVE","HASTA QUE SALGA EL SOL","SIN ANESTESIA"},
		 {"BEBÉ","YO PUEDO","AMALTE","LENTO","TODA LA NOCHE","SIN COMPLOMISO"}
		,{"PRINCESS","YO VENGO A","LIGAR","RÁPIDO","HASTA EL AMANECER","FEIS TO FEIS"},
		{"MAMI","VOY A","JUGAR","FUERTE","TODO EL DIA","SIN MIEDO"}};
		
		for (int x=0; x <3; x++) {
			
			  for (int y=0; y <6; y++) {
				  
				  int numero=(int)(Math.random()*10);
				  
				 while(numero>3) {
					 
					 numero=(int)(Math.random()*10);
				 }
				 
				 x++;
				
				  frase+=palabras[numero][y]+" ";
				  
			  }
			  
			}
		
		return frase;
	}
	
	public String crearCancion() {
		
		String leer="";
		
		JOptionPane.showMessageDialog(null, "Canción creada correctamente.");
		
		for(int i=0;i<4;i++) {
			
		String retorno=crearFrase()+"\n";
		String retorno2=crearFrase()+"\n";
		String retorno3=crearFrase()+"\n";
		String retorno4=crearFrase()+"\n";
		
		
		leer+=retorno+retorno2+retorno3+retorno4+"\n";
		
		}
		
		return leer;
	}
}