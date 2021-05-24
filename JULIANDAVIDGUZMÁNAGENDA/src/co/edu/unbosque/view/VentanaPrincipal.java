package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaPrincipal extends JFrame{

	public PanelPrincipal prin;
	public JLayeredPane lpane;
	
	public VentanaPrincipal() {
		
		setTitle("Menú Principal");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void inicializarComponentes() {
		
		prin = new PanelPrincipal();
		prin.setBounds(5, 5, 475,350);
		prin.setOpaque(false);
		getContentPane().add(prin);
		
		lpane = new JLayeredPane();
		lpane.setBounds(0, 0, 400, 400);
		getContentPane().add(lpane);
	
	}

	public PanelPrincipal getPrin() {
		return prin;
	}

	public void setPrin(PanelPrincipal prin) {
		this.prin = prin;
	}

	public JLayeredPane getLpane() {
		return lpane;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpane = lpane;
	}	
	
}