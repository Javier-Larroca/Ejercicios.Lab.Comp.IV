package clases;

public class Categorias {
	private int ID;
	private String nombre;
	
	public Categorias() {}
	
	public Categorias(int iD, String nombre) {
		super();
		ID = iD;
		this.nombre = nombre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return ID + " - " + nombre;
	}
	

	
}
