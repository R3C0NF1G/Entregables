package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.ClaseY;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private Binarios bd;
	
	private View gui;
	
	private ClaseY y;

	
	public Controller() {

		bd = new Binarios();
		y = new ClaseY();
		gui = new View(this);
		gui.setVisible(true);
		funcionar();
	}
    public void funcionar() {
		
		y.funcionar();
		
    }
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REGISTROS)) {
			gui.escribirMensaje	(y.getNegocios().escribirArchivoBinario());

		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REGISTROS)) {
			y.getNegocios().leerRegistro();
			gui.mostrarRegistros( y.getNegocios().getEmpleados());	
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_NOMINA)) {
			//gui.escribirMensaje(bd.getBf().escribirRegistro());
			gui.escribirMensaje(bd.getBf().escribirNomina());

		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_NOMINA)) {
			bd.getBf().leerNomina();
			gui.mostrarNomina(3, bd.getBf().getNom());
		}
	}
}