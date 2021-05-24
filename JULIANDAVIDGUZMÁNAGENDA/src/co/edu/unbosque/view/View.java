package co.edu.unbosque.view;

public class View {
	
	VentanaPrincipal vP;
	VentanaAgenda vA;
	
	public View() {
		
		vP = new VentanaPrincipal();
		vA = new VentanaAgenda();
	}

	public VentanaPrincipal getvP() {
		return vP;
	}

	public void setvP(VentanaPrincipal vP) {
		this.vP = vP;
	}

	public VentanaAgenda getvA() {
		return vA;
	}

	public void setvA(VentanaAgenda vA) {
		this.vA = vA;
	}
 
}