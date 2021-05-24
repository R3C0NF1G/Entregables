package co.edu.unbosque.controller;

import co.edu.unbosque.model.Airplane;
import co.edu.unbosque.model.Bird;
import co.edu.unbosque.model.Bob;
import co.edu.unbosque.model.Flash;
import co.edu.unbosque.model.Superman;

public class Controller {
	
	Airplane ap;
	Bird b;
	Superman sp;
	Flash fl;
	Bob bo;
	
	public Controller() {
		
		ap.takeOn();
		ap.land();
		ap.fly();
		ap.takeOff();
		
		b.takeOff();
		b.land();
		b.fly();
		b.eat();
		
		sp.takeOff();
		sp.land();
		sp.fly();
		sp.eat();
		sp.leapBuilding();
		sp.stopBullet();
		
		fl.eat();
		fl.reponerse();
		fl.salvarMundo();
		fl.correr();
		
		bo.eat();
		bo.reponerse();
		bo.repugnar();
		
	}
}