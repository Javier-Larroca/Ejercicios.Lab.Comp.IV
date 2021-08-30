package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{

	private String cargo;
	private int antiguedadDocente;

	public Profesor() {
		super();
		
	}
	
	public Profesor(String Nombre, int Edad, String Cargo, int Antiguedad) {
		super(Nombre, Edad);
		this.cargo = Cargo;
		this.antiguedadDocente = Antiguedad;
		
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public String toString() {
		return "Profesor: Id: " + getId() + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + " años, Cargo: " + getCargo() + ", Antigüedad: " + getAntiguedadDocente() + " años.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Profesor o) {
		// TODO Auto-generated method stub
		
		if(o.getEdad() == this.getEdad()) {
			return 0;
			
		}
		if(o.getEdad() < this.getEdad()) {
			return -1;
		}
		
		return 1;
	}




	
	
	
}
