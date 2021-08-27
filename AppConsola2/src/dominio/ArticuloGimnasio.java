package dominio;

public class ArticuloGimnasio extends Articulo{
	
	private int peso;
	private static final int gramos = 1000;
	
	//Metodo
	
	public int devuelvePesoEnGr() {
		return peso * gramos;
	}
	
	//Constructores
	public ArticuloGimnasio(){
		super();
	}
	
	public ArticuloGimnasio(String nombre, int peso) {
		super(nombre);
		this.peso=peso;
	}

	//Getters y Setters
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	//Metodo ToString
	@Override
	public String toString() {
		return super.toString() + ", PESO= " + peso;
	}
	
	
	
}
