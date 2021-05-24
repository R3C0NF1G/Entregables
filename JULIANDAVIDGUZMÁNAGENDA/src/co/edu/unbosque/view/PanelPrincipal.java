package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelPrincipal extends JPanel{

	public JButton agendar;
	public JButton consultar;
	public JButton info;
	public JLabel titulo;
	
	public PanelPrincipal (){
		
		setLayout(null);
		inicializarComponentes();
		
		
	}
	
	public void inicializarComponentes() {
		
		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));
		
		titulo = new JLabel("BIENVENIDO");
		titulo.setForeground(Color.black);
		titulo.setFont(new Font("Century Gothic" ,getFont().BOLD, 40));
		titulo.setBounds(130, 50, 264, 45);
		add(titulo);
		
		agendar = new JButton ("AGENDAR");
		agendar.setActionCommand("AGENDE");
		agendar.setBounds(160, 210, 155, 30);
		agendar.setBackground(Color.LIGHT_GRAY);
		add(agendar);
		
		consultar = new JButton("CONSULTAR");
		consultar.setActionCommand("CONSULTE");
		consultar.setBackground(Color.LIGHT_GRAY);
		consultar.setBounds(160, 170, 155, 30);
		add(consultar);
		
		info = new JButton("?");
		info.setActionCommand("INF");
		info.setBackground(Color.LIGHT_GRAY);
		info.setBounds(399, 305, 70, 40);
		add(info);
		
	}

	public JButton getAgendar() {
		return agendar;
	}

	public void setAgendar(JButton agendar) {
		this.agendar = agendar;
	}

	public JButton getConsultar() {
		return consultar;
	}

	public void setConsultar(JButton consultar) {
		this.consultar = consultar;
	}

	public JButton getInfo() {
		return info;
	}

	public void setInfo(JButton info) {
		this.info = info;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}
	
}