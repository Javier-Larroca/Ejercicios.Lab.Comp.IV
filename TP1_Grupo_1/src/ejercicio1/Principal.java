package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Lisa");
		empleado1.setEdad(8);
		System.out.println(empleado1.toString());
		System.out.println("Siguiente Id: "+ Empleado.devuelveProximoId());
		
		Empleado empleado2 = new Empleado("Homero", 36);
		empleado2.toString();
		System.out.println(empleado2.toString());
		System.out.println("Siguiente Id: "+ Empleado.devuelveProximoId());
		
		Empleado empleado3 = new Empleado();
		empleado3.setNombre("Bart");
		empleado3.setEdad(10);
		System.out.println(empleado3.toString());
		System.out.println("Siguiente Id: "+ Empleado.devuelveProximoId());
		
		
		Empleado empleado4 = new Empleado("Marge", 34);
		System.out.println(empleado4.toString());
		System.out.println("Siguiente Id: "+ Empleado.devuelveProximoId());
		
		Empleado empleado5 = new Empleado();
		empleado5.setNombre("Maggie");
		empleado5.setEdad(1);
		System.out.println(empleado5.toString());
		System.out.println("Siguiente Id: "+ Empleado.devuelveProximoId());
	
	}

}
