package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Superman extends Superhero implements Flyer {

	public void leapBuilding() {
		
		JOptionPane.showMessageDialog(null, "Saltaré el Empire State para emboscar al sospechoso.");
	}
	
	public void stopBullet() {
		
		JOptionPane.showMessageDialog(null, "El sospechoso me dispará, así que romperé esa bala en mil pedazos.");
	}
	
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Zzz..." , "¡SILENCIO!" , 3 );
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Iré caminando tal y como un mortal." , "¡FLOJERA!" , 1 );
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Iré volando hasta la luna." , "¡A TODA MARCHA!" , 2 );
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "M'c Donalcs ahí te voy." , "¡HAMBRIENTO!" , 3 );
	}

	@Override
	public void reponerse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarMundo() {
		// TODO Auto-generated method stub
		
	}
}