package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.model.persistence.Nomina;

public class View extends JFrame{
	
	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada; //Se declara un objeto de tipo PanelEntrada
	private PanelRegistro panelRegistro; //Se declara un objeto de tipo PanelResultados
	private PanelNomina panelNomina;
	
	public View(Controller control) 
	{
		// Definición de los parámetros básicos de la ventana principal
		
		setSize(500,450); //tamaño en ancho y alto en pixeles
		setResizable(false); //Se puede cambiar el tamaño de la ventana?
		setTitle("Nómina"); //tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qué debe hacer si cierra la ventana
		setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
		//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
		setLayout( new BorderLayout() );
		//Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelRegistro = new PanelRegistro();
		add(panelRegistro,BorderLayout.CENTER);
		panelNomina = new PanelNomina();
		add(panelNomina,BorderLayout.SOUTH);
		
		//se agrega al boton ActionListener del objeto de Controlador - cambio
		panelEntrada.getButEscribir().addActionListener(control);
		panelEntrada.getButLeer().addActionListener(control);
		panelEntrada.getButLeerReg().addActionListener(control);
		panelEntrada.getButEscribirReg().addActionListener(control);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public PanelNomina getPanelNomina() {
		return panelNomina;
	}

	public void setPanelNomina(PanelNomina panelNomina) {
		this.panelNomina = panelNomina;
	}

	
	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarRegistros(ArrayList<EmpleadoDTO> a) {
		
			getPanelRegistro().getTxtNombre().append(String.valueOf(a.get(0))+"\n");
			getPanelRegistro().getTxtEdad().append(String.valueOf(a.get(1))+"\n");
			
		
	}
	public void mostrarNomina(int numNom, Nomina[] nom) {
		for (int i= 0 ; i<numNom ; i++) {
			getPanelNomina().getTxtCedula().append(String.valueOf(nom[i].getCedula())+"\n");
			getPanelNomina().getTxtHoras().append(String.valueOf(nom[i].getHoras())+"\n");
			getPanelNomina().getTxtMes().append(String.valueOf(nom[i].getMes())+"\n");
		}	
	}
	
}