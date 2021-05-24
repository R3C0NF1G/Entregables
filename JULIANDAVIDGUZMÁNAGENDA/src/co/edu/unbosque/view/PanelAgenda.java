package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelAgenda extends JPanel{
	
	public JLabel titulo;
	public JLabel nombre;
	public JLabel telefono;
	public JLabel id;
	public JTextField names;
	public JTextField tel;
	public JTextField cc;
	public JButton asignar;
	public JButton volver;
	
	public PanelAgenda() {
		
		setLayout(null);
		inicializarComponentes();
		
	}
	
	public void inicializarComponentes() {
		
		titulo = new JLabel("INGRESE SUS DATOS");
		titulo.setForeground(Color.black);
		titulo.setFont(new Font("Century Gothic" , getFont().BOLD, 20));
		titulo.setBounds(130, 30, 264, 45);
		add(titulo);
		
		nombre = new JLabel("Nombre: ");
		nombre.setForeground(Color.black);
		nombre.setFont(new Font("Century Gothic", 20, 30));
		nombre.setBounds(80, 80, 264, 45);
		add(nombre);
		
		names = new JTextField();
		names.setBounds(230, 82, 100, 40);
		names.setBorder(new LineBorder(null));
		names.setEditable(true);
		add(names);
		
		telefono = new JLabel("Teléfono: ");
		telefono.setForeground(Color.black);
		telefono.setFont(new Font("Century Gothic", 20, 30));
		telefono.setBounds(80, 160, 264, 45);
		add(telefono);
		
		tel = new JTextField("");
		tel.setBounds(230, 162, 100, 40);
		tel.setBorder(new LineBorder(null));
		tel.setEditable(true);
		add(tel);
		
		id = new JLabel("C.C: ");
		id.setForeground(Color.black);
		id.setFont(new Font("Century Gothic", 20, 30));
		id.setBounds(80, 220, 264, 45);
		add(id);
		
		cc = new JTextField ("");
		cc.setBounds(230, 222, 100, 40);
		cc.setBorder(new LineBorder(null));
		cc.setEditable(true);
		add(cc);
		
		asignar = new JButton("ASIGNAR");
		asignar.setActionCommand("ASIGNE");
		asignar.setBackground(Color.LIGHT_GRAY);
		asignar.setBounds(50, 300 , 100, 40);
		add(asignar);
		
		volver = new JButton("VOLVER");
		volver.setActionCommand("VUELVA");
		volver.setBackground(Color.LIGHT_GRAY);
		volver.setBounds(350, 300, 100, 40);
		add(volver);
		
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getId() {
		return id;
	}

	public void setId(JLabel id) {
		this.id = id;
	}

	public JTextField getNames() {
		return names;
	}

	public void setNames(JTextField names) {
		this.names = names;
	}

	public JTextField getTel() {
		return tel;
	}

	public void setTel(JTextField tel) {
		this.tel = tel;
	}

	public JTextField getCc() {
		return cc;
	}

	public void setCc(JTextField cc) {
		this.cc = cc;
	}

	public JButton getAsignar() {
		return asignar;
	}

	public void setAsignar(JButton asignar) {
		this.asignar = asignar;
	}

	public JButton getVolver() {
		return volver;
	}

	public void setVolver(JButton volver) {
		this.volver = volver;
	}

}