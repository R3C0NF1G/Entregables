package co.edu.unbosque.model;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Alfabeto {
	
	public String [] letra = new String[26];
	
	public String txta;

	public Alfabeto() {
		
		this.letra = letra;
		
		this.txta = txta;
	
	}
	
	public String [] alfabetoa() {
		
		letra[0] = "a";
		letra[1] = "b";
		letra[2] = "c";
		letra[3] = "d";
		letra[4] = "e";
		letra[5] = "f";
		letra[6] = "g";
		letra[7] = "h";
		letra[8] = "i";
		letra[9] = "j";
		letra[10] = "k";
		letra[11] = "l";
		letra[12] = "m";
		letra[13] = "n";
		letra[14] = "o";
		letra[15] = "p";
		letra[16] = "q";
		letra[17] = "r";
		letra[18] = "s";
		letra[19] = "t";
		letra[20] = "u";
		letra[21] = "v";
		letra[22] = "w";
		letra[23] = "x";
		letra[24] = "y";
		letra[25] = "z";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es la primera letra de su primer apellido?\nEscoja una opción correspondiente a la letra.\nÓrden alfabético:\n 1. a\n 2. b\n 3. c\n 4. d\n 5. e\n 6. f\n 7. g\n 8. h\n 9. i\n 10. j\n 11. k\n 12. l\n 13. m\n 14. n\n 15. o\n 16. p\n 17. q\n 18. r\n 19. s\n 20. t\n 21. u\n 22. v\n 23. w\n 24. x\n 25. y\n 26. z"));
		
		switch(opcion){
		
		case 1:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA VERDADERA");
			
			break;
			
		case 2:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA EXCITANTE ");
			
			break;
			
		case 3:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA HORRIPILANTE ");
			
			break;
		
		case 4:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA ALEGRE ");
			
			break;
		
		case 5:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA FATAL ");
			
			break;
		
		case 6:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA APASIONANTE ");
			
			break;
		
		case 7:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA TRÁGICA ");
			
			break;
		
		case 8:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA SANGRIENTA ");
			
			break;
		
		case 9:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA FAMOSA ");
			
			break;
		
		case 10:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA GRAN ");
			
			break;
		
		case 11:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA PENOSA ");
			
			break;
		
		case 12:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA TRISTE ");
			
			break;
		
		case 13:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA DESASTROSA ");
			
			break;
			
		case 14:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA HERMOSA ");
			
			break;
		
		case 15:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA OSCURA ");
			
			break;
			
		case 16:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA GLORIOSA ");
			
			break;
		
		case 17:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA FELIZ ");
			
			break;
		
		case 18:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA EMOCIONANTE ");
			
			break;
		
		case 19:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA FANTÁSTICA ");
			
			break;
			
		case 20:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA TERRORÍFICA ");
			
			break;
		
		case 21:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA ABURRIDA ");
			
			break;
		
		case 22:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA INCREÍBLE ");
			
			break;
		
		case 23:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA DESGRACIADA ");
			
			break;
			
		case 24:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA LAMENTABLE ");
			
			break;
		
		case 25:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA CÓSMICA ");
			
			break;
			
		case 26:
			
			JOptionPane.showMessageDialog(null, "El gancho de el título de el libro de su vida es: " + "LA MISERABLE ");
			
			break;
			
		default:
			
			JOptionPane.showInputDialog(null, "Opción incorrecta.");
			
		break;
		
		}

		return letra;
			
	}
}