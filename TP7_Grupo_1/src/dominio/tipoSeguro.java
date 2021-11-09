package dominio;

public class tipoSeguro {
	
	private int Id;
	private String Descripcion;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public tipoSeguro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "tipoSeguro [Id=" + Id + ", Descripcion=" + Descripcion + "]";
	}

}
