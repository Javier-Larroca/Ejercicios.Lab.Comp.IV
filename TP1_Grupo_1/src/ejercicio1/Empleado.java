package ejercicio1;

public class Empleado {
	//Generamos variable ID
	private static int contador= 1000;
	//Atributos
	private final int id=contador;
	private String nombre;
	private int edad;

	//Constructor
	public Empleado() {
		contador++;
		this.nombre="Sin nombre";
		this.edad=99;
	}
	
	public Empleado(String nombre, int edad) {
		contador++;
		this.nombre=nombre;
		this.edad=edad;
	}
	
	//Getters y setters
	public int getId() {
		return id;
	}
	//public void setId(int id) {
	//	this.id = id;
	//}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodos
	public static int devuelveProximoId() {
		return contador;
	}

	@Override
	public String toString() {
		return "Empleado - Id: " + id + " Nombre: " + nombre + " Edad: " + edad;
	}
	
}
