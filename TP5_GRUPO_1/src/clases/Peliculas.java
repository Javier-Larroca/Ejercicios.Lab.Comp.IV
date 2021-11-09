package clases;

public class Peliculas implements Comparable<Peliculas> {
	private static int contador= 0;
	private final int id=contador;
	private String nombre;
	private Categorias categoria;
	
	public Peliculas()
	{
		contador++;
		categoria = new Categorias();
	}
	

	public Peliculas(String nombre, Categorias categoria) {
		super();
		contador++;
		categoria = new Categorias();
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	public static int getContador() {
		return contador ;
	}

	public static void setContador(int contador) {
		Peliculas.contador = contador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Categoria: " + categoria;
	}


	@Override
	public int compareTo(Peliculas arg0) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(arg0.getNombre());
	}
	
	
	
	
	
}
