package ejercicio2;

import java.util.Date;

public class ProductosRefrigerados extends Producto{

	private int codigoOrganismoSupervisionAlimentaria;
	
	//Constructores
	public ProductosRefrigerados() {
		super();
	}
	
	public ProductosRefrigerados(Date fechaCaducidad, int numeroLote, int codigoOrganismoSupervisionAlimentaria) {
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
		return "Productos Refrigerados -  Fecha Caducidad: "+ getFechaCaducidad() + ", numero de lote: " + getNumeroLote() 
		+", codigo organismo de supervision alimentaria: " + codigoOrganismoSupervisionAlimentaria;
	}
	
}
