package ejercicio2;
import java.util.Date;

public class Producto {
	private Date fechaCaducidad;
	private int numeroLote;
	
	//Constructor
	public Producto() {
		
	}
	
	public Producto(String fechaCaducidad, int numeroLote) {
		this.fechaCaducidad = new Date(fechaCaducidad);
		this.numeroLote = numeroLote;
	}
	
	//Getters y Setters
	public String getFechaCaducidad() {
		return fechaCaducidad.getDate() + "/" + (fechaCaducidad.getMonth()+1) + "/" + (fechaCaducidad.getYear() + 1900);
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = new Date(fechaCaducidad);
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	//Metodo ToString
	@Override
	public String toString() {
		return "Producto - Fecha Caducidad: "+ fechaCaducidad + ", numeroLote=" + numeroLote;
	}
	
}
