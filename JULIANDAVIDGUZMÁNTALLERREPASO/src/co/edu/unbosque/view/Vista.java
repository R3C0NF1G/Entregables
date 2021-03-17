package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Vista {

	String nota;

	public Vista() {
		
		this.nota = nota;
	}
	
	public String mostrarNota() {
		
		String nota = "LA ESTRUCTURA DE EL TÍTULO ES:\nEl GANCHO + PALABRA CLAVE + LOCALIZACIÓN O ADJETIVO.\nFuente: https://mdm.usta.edu.co/remos_downloads/lectoescritura/2015-2/clarajaramillo-Lectoescritura-3-20152_no/elementos_sugeridos_en_la_estructura_de_un_ttulo.html";
		
		JOptionPane.showMessageDialog(null, nota);
		
		return nota;
		
	}
}
