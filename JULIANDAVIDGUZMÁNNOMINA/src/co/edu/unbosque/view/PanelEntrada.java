package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton b_leerRegistros;
	private JButton b_escribirRegistros;
	private JButton b_leerNomina;
	private JButton b_escribirNomina;
	public static final String ESCRIBIR_NOMINA = "EscribirNom";
	public static final String LEER_NOMINA = "LeerNom";
	public static final String ESCRIBIR_REGISTROS = "EscribirRegistros";
	public static final String LEER_REGISTROS = "LeerRegistros";
	
	public PanelEntrada() {
		setLayout( new GridLayout(2,2) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Acceso a registros y nomina");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("Digite un Valor");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		b_leerRegistros = new JButton("Leer registros");
		b_leerRegistros.setActionCommand(LEER_REGISTROS);
		b_escribirRegistros = new JButton("Escribir Registros");
		b_escribirRegistros.setActionCommand(ESCRIBIR_REGISTROS);
		
		b_leerNomina = new JButton("Leer Nomina");
		b_leerNomina.setActionCommand(LEER_NOMINA);

		b_escribirNomina = new JButton("Escribir Nomina");
		b_escribirNomina.setActionCommand(ESCRIBIR_NOMINA);
		//add(labEntrada);
		//add(txtNumero);
		add(b_escribirRegistros);
		add(b_leerRegistros);
		add(b_escribirNomina);
		add(b_leerNomina);
	}
	
	public static String getLeerReg() {
		return LEER_NOMINA;
	}

	public JButton getButLeerReg() {
		return b_leerNomina;
	}

	public void setButLeerReg(JButton butLeerReg) {
		this.b_leerNomina = butLeerReg;
	}

	public JButton getButEscribirReg() {
		return b_escribirNomina;
	}

	public void setButEscribirReg(JButton butEscribirReg) {
		this.b_escribirNomina = butEscribirReg;
	}

	public static String getEscribirReg() {
		return ESCRIBIR_NOMINA;
	}

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButLeer() {
		return b_leerRegistros;
	}

	public void setButLeer(JButton butLeer) {
		this.b_leerRegistros = butLeer;
	}

	public JButton getButEscribir() {
		return b_escribirRegistros;
	}

	public void setButEscribir(JButton butEscribir) {
		this.b_escribirRegistros = butEscribir;
	}
}