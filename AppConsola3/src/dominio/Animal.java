package dominio;

public abstract class Animal {

	private String nombre;

	//Constructores
	
	public Animal() {
		nombre="Sin nombre";
	}
	
	public Animal(String nombre) {
		this.nombre=nombre;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Metodo ToString
	@Override
	public String toString() {
		return "Es un animal su NOMBRE es: " + nombre;
	}
	
	//Metodo abstracto
	public abstract String habilitades();
	
}
