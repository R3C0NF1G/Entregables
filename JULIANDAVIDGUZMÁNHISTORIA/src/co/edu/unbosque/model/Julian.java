package co.edu.unbosque.model;

public class Julian extends KublaKan{
	
	public Julian(int edad, double estatura, String colorojos, String alma) {
		super(edad, estatura, colorojos, alma);
		
		this.colorojos = "Violeta";
		// TODO Auto-generated constructor stub
	}

	public String adquirirConocimientos() {
		
		return "Estudio Ingeniería de Sistemas en la Universidad El Bosque.";
	}
	
	public String tenerFamilia() {
		
		return "Mi familia se conforma por dos perros y dos gatos.";
	}
	
	public String ejercerProfesion() {
		
		return "Trabajo como arquitecto de nube en la central de CynusX1.";
	}
	@Override
	void habitar() {
		// TODO Auto-generated method stub
		
		System.out.println("Habito al este del planeta.");
		
	}

	@Override
	void sentir() {
		// TODO Auto-generated method stub
		
		System.out.println("Siento la presencia de otros mortales.");
	}

}