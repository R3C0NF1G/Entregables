package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class VentanaAgenda extends JFrame {

	public PanelAgenda agend;
	public JLayeredPane lpanea;
	
	public VentanaAgenda() {
		
		setTitle("AGENDA");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		
	}

	public void inicializarComponentes() {
		
		agend = new PanelAgenda();
		agend.setBounds(5, 5, 475,350);
		agend.setOpaque(false);
		getContentPane().add(agend);
		
		lpanea = new JLayeredPane();
		lpanea.setBounds(0, 0, 300, 300);
		getContentPane().add(lpanea);
	
	}

	public PanelAgenda getAgend() {
		return agend;
	}

	public void setAgend(PanelAgenda agend) {
		this.agend = agend;
	}

	public JLayeredPane getLpane() {
		return lpanea;
	}

	public void setLpane(JLayeredPane lpane) {
		this.lpanea = lpane;
	}
	
}