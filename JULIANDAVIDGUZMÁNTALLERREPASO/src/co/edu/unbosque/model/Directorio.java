package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Directorio {
	
	public int [] numero = new int [10];
	
	int txtd;

	public Directorio() {
		
		this.numero = numero;
		
		this.txtd = txtd;
	}
	
	public int [] directoriod() {
		
		numero[0] = 0;
		numero[1] = 1;
		numero[2] = 2;
		numero[3] = 3;
		numero[4] = 4;
		numero[5] = 5;
		numero[6] = 6;
		numero[7] = 7;
		numero[8] = 8;
		numero[9] = 9;
		
		int opciond = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cúal es el último dígito de su número telefónico?\nEscoja una opción correspondiente al número\nÓrden numérico:\n 1. 0\n 2. 1\n 3. 2\n 4. 3\n 5. 4\n 6. 5\n 7. 6\n 8. 7\n 9. 8\n 10. 9"));
		
		switch (opciond) {
		
		case 1:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN BIPOLAR ");
			
			break;
			
		case 2:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN ASESINO/A ");
			
			break;
			
		case 3:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título clave de el libro de su vida es: " + "DE UN LOCO/A ");
			
			break;
		
		case 4:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN ADICTO/A A LOS MEMES ");
			
			break;
		
		case 5:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN SOÑADOR/A ");
			
			break;
		
		case 6:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN GENIO/A INCOMPRENDIDO/A ");
			
			break;
		
		case 7:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN SÍMBOLO SEXUAL ");
			
			break;
		
		case 8:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN ALCOHÓLICO/A ");
			
			break;
		
		case 9:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN GUERRERO/A ");
			
			break;
		
		case 10:
			
			JOptionPane.showMessageDialog(null, "El adjetivo del título de el libro de su vida es: " + "DE UN AVENTURERO/A ");
			
			break;
			
			default:
				
			JOptionPane.showMessageDialog(null, "Opción incorrecta");
				
			break;
			
		}
		
		return numero;
		
	}

}