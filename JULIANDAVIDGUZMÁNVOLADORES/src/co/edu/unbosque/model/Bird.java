package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Estoy durmiendo." , "¡NO MOLESTAR!" , 3 );
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Estoy caminando en el bosque." , "¡¿VIENES?!" , 1 );
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Estoy observando a la presa." , "¡¿LA VES?!" , 2 );
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Casé a la presa, era solo un gusano." , "¡GRACIAS POR TU AYUDA!" , 1 );
	}
}