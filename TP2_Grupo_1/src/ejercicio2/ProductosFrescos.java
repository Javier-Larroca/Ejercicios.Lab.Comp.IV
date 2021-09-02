package ejercicio2;
import java.util.Date;

public class ProductosFrescos extends Producto {

	private Date fechaEnvasado;
	private String paisOrigen;
	
	//Constructores
	public ProductosFrescos() {
		super();
	}

	public ProductosFrescos(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado= new Date(fechaEnvasado);
		this.paisOrigen= paisOrigen;
	}
	
	//Getters y setters
	public String getFechaEnvasado() {
		return fechaEnvasado.getDate() + "/" + (fechaEnvasado.getMonth()+1) + "/" + (fechaEnvasado.getYear() + 1900);
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = new Date(fechaEnvasado);
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "Productos frescos - Fecha Caducidad: "+ getFechaCaducidad() + ", numero de lote: " + getNumeroLote() + ", fecha envasado: " + fechaEnvasado + ", pais origen: " + paisOrigen;
	}
	
}
