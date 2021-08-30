
package dominio;

public class Perro extends Animal{

	private String raza;

	//Constructores
	public Perro() {
		super();
		raza="Sin raza";
	}
	
	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza=raza;
	}
	
	//Getters y Setters
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Es un perro, su nombre es: " + getNombre() + " raza: "+raza;
	}

	//Desarrollo de metodo abstracto
	@Override
	public String habilitades() {
		// TODO Auto-generated method stub
		return "Los perros pueden localizar y separar olores";
	}
	
	
	
	
}
