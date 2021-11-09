package entidades;

public class Persona {
	
	private int DNI;
	private String nombre;
	private String apellido;
	
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Persona() {
		
	}
	
	public Persona(int dNI, String nombre, String apellido) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		//return "Apellido: "+ getApellido() + " - Nombre: "+getNombre()+ " - DNI: "+getDNI();
		return getNombre() + " " + getApellido() + " " + getDNI();
	}
	
	

}
