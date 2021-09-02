package ejercicio3;

public class EdificioDeOficinas extends Edificio {
	private int nroOficinas;
	
	public EdificioDeOficinas() {
		
	}
	
	public EdificioDeOficinas(double superficie, int nroOficinas) {
		super(superficie);
		this.nroOficinas=nroOficinas;
	}

	//Getters y setters
	public int getNroOficinas() {
		return nroOficinas;
	}

	public void setNroOficinas(int nroOficinas) {
		this.nroOficinas = nroOficinas;
	}

	@Override
	public String toString() {
		return "Edificio De Oficinas - Nro de oficinas: " + nroOficinas + ", Superficie: " + getSuperficie();
	}
	
}
