package co.edu.unbosque.model;

public class Renk extends KublaKan{

	public Renk(int edad, double estatura, String colorojos, String alma) {
		super(edad, estatura, colorojos, alma);
		// TODO Auto-generated constructor stub
		
		this.alma = "Falsa";
		this.edad = 1500;
	}

	public String transportarse() {
		
	return "me arrastro de un lugar a otro, esa es mi condena.";
		
	}
	
	@Override
	void habitar() {
		// TODO Auto-generated method stub
		
		System.out.println("Habito al extremo sur del planeta");
	}

	@Override
	void sentir() {
		// TODO Auto-generated method stub
		
		System.out.println("No siento a nadie más que a mí.");
		
	}

}
