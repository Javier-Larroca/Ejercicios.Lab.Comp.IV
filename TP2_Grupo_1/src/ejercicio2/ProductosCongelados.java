package ejercicio2;

public class ProductosCongelados extends Producto {
	
	private int temperaturaCongelacionRecomendada;
	
	//Constructores
	public ProductosCongelados() {
		super();
	}
	
	public ProductosCongelados(String fechaCaducidad, int numeroLote, int temperaturaCongelacionRecomendada) {
		super(fechaCaducidad, numeroLote);
		this.temperaturaCongelacionRecomendada= temperaturaCongelacionRecomendada;
	}

	
	//Getters y setters
	public int getTemperaturaCongelacionRecomendada() {
		return temperaturaCongelacionRecomendada;
	}

	public void setTemperaturaCongelacionRecomendada(int temperaturaCongelacionRecomendada) {
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	@Override
	public String toString() {
		return "Productos congelados - Fecha Caducidad: "+ getFechaCaducidad() + ", numero de lote: " + getNumeroLote() + 
				", temperatura de congelacion recomendada: " + temperaturaCongelacionRecomendada;
	}	

}
