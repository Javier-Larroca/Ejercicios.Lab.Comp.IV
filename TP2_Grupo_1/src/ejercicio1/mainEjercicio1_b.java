package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

  

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		Profesor profe1 = new Profesor("Maximiliano", 29, "Programaci�n II", 5);
		Profesor profe2 = new Profesor("Gast�n", 27, "Laboratorio II", 2);
		Profesor profe3 = new Profesor("Agust�n", 24, "Programaci�n I", 3);
		Profesor profe4 = new Profesor("Elmer", 26, "Laboratorio I", 4);
		Profesor profe5 = new Profesor("Mat�as", 23, "Programaci�n III", 6);
		
		Profesor igual1 = new Profesor("Tobias", 20, "Matematica", 1);
		Profesor igual2 = new Profesor("Tobias", 20, "Matematica", 1);
		
		TreeSet<Profesor> listaProfesores = new TreeSet <Profesor>();
		listaProfesores.add(profe1);
		listaProfesores.add(profe2);
		listaProfesores.add(profe3);
		listaProfesores.add(profe4);
		listaProfesores.add(profe5);
		
		///EJERCICIO 5
		
		Iterator<Profesor> it = listaProfesores.iterator();

		while(it.hasNext()) {
			Profesor profe = (Profesor) it.next();
			System.out.println(profe.toString());
			
		}

		///EJERCICIO 6
		
		if(igual1.equals(igual2)) {
			System.out.println("Es el mismo profesor");
		}

	}

}
