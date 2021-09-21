package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) throws DniInvalido {
		
		Archivo nuevo = new Archivo();
		
		String listadoArchivo = nuevo.leer("Personas.txt");
		
		TreeSet<Persona> lista = new TreeSet<Persona>();
		
		Persona nueva = new Persona();
		
		lista = Persona.generarListado(listadoArchivo, nueva);
		
		Iterator<Persona> it = lista.iterator();
		
		while(it.hasNext()) {
			Persona aux = it.next();	
			
			try {
				Persona.verificarDniInvalido(aux.GetDni());
				nuevo.generarResultado(aux);
				
			} catch (DniInvalido e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
	
		}
	
	}

}
