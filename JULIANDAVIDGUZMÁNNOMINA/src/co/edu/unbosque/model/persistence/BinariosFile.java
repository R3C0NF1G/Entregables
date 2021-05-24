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
import java.util.Random;

// En esta clase se implementan los métodos básicos de lectura y escritura
// de los dos ejemplos de clase, por esta razón, van aquí.

public class BinariosFile {

	
	private String ruta = "./data/prueba2.out";
	private String rutaReg = "./data/registro.out";
	private String rutaNom = "./data/nomina.out";


	private int REGISTROS = 10;
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;

	private double numeros[];
	private int valores[];
	private Registro reg;
	private Registro[] datos;
	private Nomina[] nom;

	

	public int getREGISTROS() {
		return REGISTROS;
	}

	public void setREGISTROS(int rEGISTROS) {
		REGISTROS = rEGISTROS;
	}

	
	public int[] getValores() {
		return valores;
	}

	public void setValores(int[] valores) {
		this.valores = valores;
	}

	public BinariosFile() {
		// TODO Auto-generated constructor stub
		numeros = new double[10];
		valores = new int[10];
		datos = new Registro[10];
	}

	public String escribirArchivoBinario() {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File(ruta);
		Random r=new Random(); 
		//double d=18.76353; 
		try{     
			fos=new FileOutputStream(f);     
			dos=new DataOutputStream(fos);     
			for (int i=0;i<REGISTROS;i++){ 
				dos.writeInt(i);
				dos.writeDouble(r.nextDouble());//Nº aleatorio     

			}     
			dos.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public void leerArchivoBinario() {
		f = new File(ruta);
		try {
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			for (int i=0; i<REGISTROS ; i++){
				//System.out.println(dis.readDouble());
				numeros[i] = dis.readDouble();
				valores[i] = dis.readInt();
			}
			dis.close();
		}
		catch(IOException e){     
			e.printStackTrace(); 
		} 
	}

	public String escribirRegistro() {
		String mensaje = "Registro de Empleado Ingresado!";
		Registro staff[] = new Registro[3];
		staff[0] = new Registro("Empleado Guzmán",23,1000,"1000123456");
		staff[1] = new Registro("Empleado Infante",45,4000,"1000654321");
		staff[2] = new Registro("Empleado Ortíz",37,8000,"1000654123");


		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaReg));
			out.writeObject(staff);
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
			in = new ObjectInputStream(new FileInputStream(rutaReg));
	        datos = (Registro[])in.readObject();
	        in.close();
	        for (int i = 0; i < datos.length; i++) {
	        
	        	System.out.println(datos[i]);
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String escribirNomina() {
		String mensaje = "Registro de Empleado Ingresado!";
		Nomina staff[] = new Nomina[3];
		staff[0] = new Nomina("1000123456",60000,"19");
		staff[1] = new Nomina("1000654321",40000,"20");
		staff[2] = new Nomina("1000654123",50000,"21");


		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaNom));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerNomina() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(rutaNom));
			nom = (Nomina[])in.readObject();
	        in.close();
	        for (int i = 0; i < nom.length; i++) {
	     
	        	System.out.println(nom[i]);
	        }

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Registro[] getDatos() {
		return datos;
	}

	public void setDatos(Registro[] datos) {
		this.datos = datos;
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}

	public Nomina[] getNom() {
		return nom;
	}

	public void setNom(Nomina[] nom) {
		this.nom = nom;
	}

}