package ejercicio2;

public class ProductosFrescos extends Producto {

	private String fechaEnvasado;
	private String paisOrigen;

	
	//Constructores
	public ProductosFrescos() {
		super();
	}

	public ProductosFrescos(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numeroLote);
		this.fechaEnvasado= fechaEnvasado;
		this.paisOrigen= paisOrigen;
	}
	
	//Getters y setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
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
		return "Productos frescos - Fecha Caducidad: "+ getFechaCaducidad() + ", numero de lote: " + getNumeroLote() + ", fecha envasado: " + fechaEnvasado + ", pais origen: " + paisOrigen;
	}
	
}
