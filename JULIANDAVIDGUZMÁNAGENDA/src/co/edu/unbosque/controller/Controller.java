package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	View gui;
	
	public Controller() {
		
		gui = new View();
		oyentes();
	}
	
	public void oyentes() {
		
		gui.getvP().getPrin().getAgendar().addActionListener(this);
		gui.getvP().getPrin().getConsultar().addActionListener(this);
		gui.getvP().getPrin().getInfo().addActionListener(this);
		gui.getvA().getAgend().getAsignar().addActionListener(this);
		gui.getvA().getAgend().getVolver().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	if(arg0.getActionCommand().equals("AGENDE")) {
		
		gui.getvP().setVisible(false);
		gui.getvA().setVisible(true);
		
	}else
		
		if(arg0.getActionCommand().equals("ASIGNE")) {
	
			JOptionPane.showMessageDialog(null, "Señor: " + gui.getvA().getAgend().getNames().getText() + "." + " \n" + "Su cita a sido agendada.");
	}else
		
		if(arg0.getActionCommand().equals("INF")) {
			
			JOptionPane.showMessageDialog(null, "Julian David Guzmán", "@Author: " , 3);
	
		}else
		
			if(arg0.getActionCommand().equals("CONSULTE")) {
			
				if(gui.getvA().getAgend().getNames().getText() == null){
					
					JOptionPane.showMessageDialog(null, "Debe agendar su cita primero.");
					
				}else
					
				JOptionPane.showMessageDialog(null, "Cita para: " + gui.getvA().getAgend().getNames().getText() + "." + " \n" + "En espera...");
				
				gui.getvA().getAgend().getNames().setText(null);
				gui.getvA().getAgend().getTel().setText(null);
				gui.getvA().getAgend().getCc().setText(null);
				
			}else
				
				if(arg0.getActionCommand().equals("VUELVA")) {
					
					gui.getvA().setVisible(false);
					gui.getvP().setVisible(true);
		}
	}
}