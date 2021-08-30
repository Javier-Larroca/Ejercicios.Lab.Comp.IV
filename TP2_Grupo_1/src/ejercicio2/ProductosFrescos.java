package ejercicio2;
import java.util.Date;

public class ProductosFrescos extends Producto {

	private Date fechaEnvasado;
	private String paisOrigen;

	
	//Constructores
	public ProductosFrescos() {
		super();
	}

	public ProductosFrescos(Date fechaCaducidad, int numeroLote, Date fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado= fechaEnvasado;
		this.paisOrigen= paisOrigen;
	}
	
	//Getters y setters
	public Date getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(Date fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Productos frescos - Fecha Caducidad: "+ getFechaCaducidad() + ", numeroLote: " + getNumeroLote() + ", fecha envasado: " + fechaEnvasado + ", pais origen: " + paisOrigen;
	}
	
	
	
}
