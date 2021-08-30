package dominio;

public class Gato extends Animal{
	
	public Gato() {
		super();
	}

	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Es un gato se llama: "+getNombre();
	}

	//Implementacion de metodo bastracto
	@Override
	public String habilitades() {
		// TODO Auto-generated method stub
		return "Los gatos tienen gran flexibilidad y elasticidad";
	}
	
	
}
