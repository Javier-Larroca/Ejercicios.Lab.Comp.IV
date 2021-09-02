package ejercicio3;

public class Edificio {
	private double superficie;

	public Edificio() {
		
	}
	
	public Edificio(double superficie) {
		this.superficie = superficie;
	}
	
	
	//Getters y setters
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Edifio - Superficie: " + superficie;
	}
	
}
