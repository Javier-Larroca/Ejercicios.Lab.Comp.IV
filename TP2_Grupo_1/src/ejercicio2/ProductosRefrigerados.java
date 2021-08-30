package ejercicio2;


public class ProductosRefrigerados extends Producto{

	private int codigoOrganismoSupervisionAlimentaria;
	
	//Constructores
	public ProductosRefrigerados() {
		super();
	}
	
	public ProductosRefrigerados(String fechaCaducidad, int numeroLote, int codigoOrganismoSupervisionAlimentaria) {
		super(fechaCaducidad, numeroLote);
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
	}

	//Getters y Setters
	public int getCodigoOrganismoSupervisionAlimentaria() {
		return codigoOrganismoSupervisionAlimentaria;
	}

	public void setCodigoOrganismoSupervisionAlimentaria(int codigoOrganismoSupervisionAlimentaria) {
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
	}

	@Override
	public String toString() {
		return "Productos refrigerados -  Fecha Caducidad: "+ getFechaCaducidad() + ", numero de lote: " + getNumeroLote() 
		+", codigo organismo de supervision alimentaria: " + codigoOrganismoSupervisionAlimentaria;
	}
	
}
