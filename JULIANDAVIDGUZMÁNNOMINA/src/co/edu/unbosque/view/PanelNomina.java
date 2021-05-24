package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelNomina extends JPanel{

	private JTextArea txtCedula;
	private JTextArea txtHoras;
	private JTextArea txtMes;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public PanelNomina() {
		setLayout( new GridLayout(1,3) );
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Nomina");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Nomina");
		txtCedula = new JTextArea("");
		txtCedula.setForeground(Color.BLACK);
		txtCedula.setBackground(Color.WHITE);
	
		txtHoras = new JTextArea("");
		txtHoras.setForeground(Color.BLACK);
		txtHoras.setBackground(Color.WHITE);
		
		txtMes = new JTextArea("");
		txtMes.setForeground(Color.BLACK);
		txtMes.setBackground(Color.WHITE);
		
		//add(labArchivo);
		//add(new JLabel(""));
		add(txtCedula);
		add(txtHoras);
		add(txtMes);
	}

	public JTextArea getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextArea txtCedula) {
		this.txtCedula = txtCedula;
	}

	public JTextArea getTxtHoras() {
		return txtHoras;
	}

	public void setTxtHoras(JTextArea txtHoras) {
		this.txtHoras = txtHoras;
	}

	
	public void setTxtMes(JTextArea txtMes) {
		this.txtMes = txtMes;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}

	public JTextArea getTxtMes() {
		return txtMes;
	}
}