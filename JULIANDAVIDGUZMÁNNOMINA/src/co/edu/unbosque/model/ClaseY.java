package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.model.persistence.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;

public class ClaseY {
	
	private EmpleadoDAO negocios;
	private BinariosFile f;

	
	public ClaseY() {	
		negocios= new EmpleadoDAO();
		f= new BinariosFile ();

	}
	
	/* metodo que realiza un proceso basado en un parámetro "dato" 
	 * y retorne el dato procesado en esta claseY. Reemplazar por lo que se necesiten
	 */
	/*public String procesarDatoClaseY(String dato) {
		return dato+" Procesado por Clase Y";
	}*/
	
	public void funcionar() {
       // EmpleadoDAO clienteBusinessObject = new EmpleadoDAO();
		negocios.escribirArchivoBinario();
		//obtiene todos los clientes
		negocios.obtenerEmpleados().forEach(System.out::println);
		
		// actualiza un cliente
		System.out.println("---");
		EmpleadoDTO Empleado = negocios.obtenerEmpleado(0);
		Empleado.setNombre("Julian");
		negocios.actualizarEmpleado(Empleado);
		
		// obtiene un cliente
		System.out.println("---");
		Empleado=negocios.obtenerEmpleado(0);
		System.out.println(Empleado);
		
		//elimina un cliente
		System.out.println("---");
		Empleado=negocios.obtenerEmpleado(0);
		negocios.eliminarEmpleado(Empleado);		
		
	}

	public EmpleadoDAO getNegocios() {
		return negocios;
	}

	public void setNegocios(EmpleadoDAO negocios) {
		this.negocios = negocios;
	}

	public BinariosFile getF() {
		return f;
	}

	public void setF(BinariosFile f) {
		this.f = f;
	}
}