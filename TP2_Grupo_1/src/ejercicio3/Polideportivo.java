package ejercicio3;

public class Polideportivo extends Edificio implements IInstalacionDeportiva{

	private String nombre;
	private final int tipoDeInstalacion=304;
	
	public Polideportivo() {
		
	}
	
	public Polideportivo(String nombre, double superficie) {
		super(superficie);
		this.nombre = nombre;
	}
	
	//Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Implementacion de metodo de la interfaz
	@Override
	public int getTipoInstalacion() {
		return tipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "Polideportivo - Nombre: " + nombre + ", Tipo de instalacion: " + tipoDeInstalacion + ", Superficie: "
				+ getSuperficie();
	}
	
	
	
}
