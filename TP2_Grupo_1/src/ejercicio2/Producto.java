package ejercicio2;
import java.util.Date;

public class Producto {
	private Date fechaCaducidad;
	private int numeroLote;
	
	//Constructor
	public Producto() {
		
	}
	
	public Producto(Date fechaCaducidad, int numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}
	
	//Getters y Setters
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
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
