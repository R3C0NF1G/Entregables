package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Calendario {
	
	public String [] mes = new String[12];
	
	public String txtc;

	public Calendario() {
		
		this.mes = mes;
		
		this.txtc = txtc;
		
	}
	
	public String[] calendarioc() {
		
		String txtc;
		
		mes[0] = "enero";
		mes[1] = "febrero";
		mes[2] = "marzo";
		mes[3] = "abril";
		mes[4] = "mayo";
		mes[5] = "junio";
		mes[6] = "julio";
		mes[7] = "agosto";
		mes[8] = "septiembre";
		mes[9] = "octubre";
		mes[10] = "noviembre";
		mes[11] = "diciembre";
		
		int opcionc = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En qué mes nació?\nEscoja una opción correspondiente al mes.\nCalendario:\n 1. enero\n 2. febrero\n 3. marzo\n 4. abril\n 5. mayo\n 6. junio\n 7. julio\n 8. agosto\n 9. septiembre\n 10. octubre\n 11. noviembre\n 12. diciembre"));
		
		switch(opcionc) {
		
		case 1:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "HAZAÑA ");
			
			break;
			
		case 2:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "REENCARNACIÓN ");
			
			break;
			
		case 3:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "BATALLA ");
			
			break;
		
		case 4:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "EXISTENCIA ");
			
			break;
		
		case 5:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "MUERTE ");
			
			break;
		
		case 6:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "MISIÓN ");
			
			break;
		
		case 7:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "VENGANZA ");
			
			break;
		
		case 8:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "ANÉCDOTA ");
			
			break;
		
		case 9:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "VIDA ");
			
			break;
		
		case 10:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "LEYENDA ");
			
			break;
		
		case 11:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "HISTORIA ");
			
			break;
		
		case 12:
			
			JOptionPane.showMessageDialog(null, "La palabra clave del título de el libro de su vida es: " + "BIOGRAFIA ");
			
			break;
			
		default:
		
			JOptionPane.showMessageDialog(null, "Opción incorrecta");
			
			break;
		
		}
		
		return mes;
		
	}

}
