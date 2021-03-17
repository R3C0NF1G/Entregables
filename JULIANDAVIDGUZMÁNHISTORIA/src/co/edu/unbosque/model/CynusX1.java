package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class CynusX1 {
	
	Astar as;
	Kira kir;
	Renk ren;
	Julian j;
	
	public CynusX1 () {
		
		as = new Astar(0, 3.00, null, null);
		
		kir = new Kira(0, 3.00, null, null);
		
		ren = new Renk(1500, 0, null, "Falsa");
		
		j = new Julian(0, 0, "Violeta", null);
		
	}
	
	public void dioses() {
		
		JOptionPane.showMessageDialog(null, " Mi nombre es Astar y mido: " + as.getEstatura() + "m" + ". " + as.volar() + " Pero cuidado " + as.crearFuego() + " Por último... " + as.detenerTiempo() , "Dios: Astar", 2);
		
		as.habitar();
		as.sentir();
		
		JOptionPane.showMessageDialog(null, " Mi nombre es Kira y mido: " + kir.getEstatura() + "m" + ". " + kir.volar() + " Y dime... " + kir.crearFuego() + " Te cuento qué " + kir.detenerTiempo() , "Diosa: Kira", 2);
		
		kir.habitar();
		kir.sentir();
	}
	
	public void desterrado() {
		
		JOptionPane.showMessageDialog(null, " Mi nombre es Renk y tengo: " + ren.getEdad() + " años." + " Mi alma es: " + ren.getAlma() + " ... Me despido de ti diciendo te que " + ren.transportarse() , "Desterrado: Renk" , 0);
		
		ren.habitar();
		ren.sentir();
	}
	
	public void mortal() {
		
		JOptionPane.showMessageDialog(null, " Mi nombre es Julian y mis ojos son de color: " + j.getColorojos() + " ." + j.adquirirConocimientos() + " " + j.tenerFamilia() + " Y por último..." + j.ejercerProfesion() , "Mortal: Julian" , 1);
		
		j.habitar();
		j.sentir();
	}
}