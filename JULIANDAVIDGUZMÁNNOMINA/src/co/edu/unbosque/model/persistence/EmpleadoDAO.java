package co.edu.unbosque.model.persistence;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class EmpleadoDAO {

	private ArrayList<EmpleadoDTO> empleados;
	private String ruta = "./data/crud.out";
	
	public EmpleadoDAO () {
	     empleados=new ArrayList<>();	
		}
	
	public String escribirArchivoBinario() {
		String mensaje="Ha ingresado los empleados exitosamente";
	
		empleados.add(new EmpleadoDTO(0,"Julian",19,50000));
		empleados.add(new EmpleadoDTO(1,"David",20,40000));
		

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(empleados);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerRegistro() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
			empleados = (ArrayList<EmpleadoDTO>)in.readObject();
	        in.close();
	        	
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void eliminarEmpleado(EmpleadoDTO empleado) {
		empleados.remove(empleado.getId());
		System.out.println("Empleado "+empleado.getId()+" eliminado.");
		
	}
	
	public List<EmpleadoDTO> obtenerEmpleados(){
		return empleados;
		
	}
	
	public EmpleadoDTO obtenerEmpleado(int id) {
		return empleados.get(id);
	}
	
	public void actualizarEmpleado(EmpleadoDTO empleado) {
		empleados.get(empleado.getId()).setNombre(empleado.getNombre());
		empleados.get(empleado.getId()).setEdad(empleado.getEdad());
		empleados.get(empleado.getId()).setSalario(empleado.getSalario());
		System.out.println("Empleado id: "+ empleado.getId()+" actualizado.");		
	}

	public ArrayList<EmpleadoDTO> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<EmpleadoDTO> empleados) {
		this.empleados = empleados;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}	
}