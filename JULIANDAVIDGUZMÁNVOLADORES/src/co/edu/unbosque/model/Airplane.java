package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public abstract class Airplane extends Vehicle implements Flyer {
	
	public void takeOn() {
		
		JOptionPane.showMessageDialog(null, "Avión encendido." , "¡PRECAUCIÓN!" , 1);
	}
	
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Avión apagado." , "¡ATENCIÓN!" , 2 );
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Próximos a despegar." , "¡ATENCIÓN!" , 3 );
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Tripulación, estamos volando." , "¡ATENCIÓN!" , 1 );
	}
}