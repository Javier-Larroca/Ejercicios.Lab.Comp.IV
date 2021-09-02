package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

import ejercicio1.Profesor;

public class MainEjercicio3 {

	public static void main(String[] args) {
		
		Polideportivo poli1 = new Polideportivo("Polideportivo 1", 185.2);
		Polideportivo poli2 = new Polideportivo("Polideportivo 2", 800.5);
		Polideportivo poli3 = new Polideportivo("Polideportivo 3", 544.7);
		
		EdificioDeOficinas edifOf1 = new EdificioDeOficinas(450.1 , 8);
		EdificioDeOficinas edifOf2 = new EdificioDeOficinas(960.4 , 12);
	
		ArrayList<Edificio> listEdif = new ArrayList <Edificio>();
		listEdif.add(poli1);
		listEdif.add(poli2);
		listEdif.add(poli3);
		listEdif.add(edifOf1);
		listEdif.add(edifOf2);
		
		Iterator it = listEdif.iterator();
		
		while(it.hasNext()) {
			Edificio edif = (Edificio) it.next();
			System.out.println(edif.toString());
		}
	}
}
