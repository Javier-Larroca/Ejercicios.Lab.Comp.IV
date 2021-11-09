package negocioImp;

import java.util.List;

import dao.PersonaDao;
import daoImp.PersonaDaoImp;
import entidades.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImp implements PersonaNegocio{

	PersonaDao datos = new PersonaDaoImp();
	@Override
	public boolean agregar(Persona persona) {
		
		return datos.agregar(persona);
	}

	@Override
	public boolean eliminar(int dni) {
		
		return datos.eliminar(dni);
	}

	@Override
	public boolean modificar(Persona persona) {
		
		return datos.modificar(persona);
	}

	@Override
	public List<Persona> listar() {

		return datos.listar();
	}

	@Override
	public boolean camposValidos(Persona persona) {
		
		boolean valido = false;
		
		if(persona.getNombre().trim().length()>0 && persona.getApellido().trim().length()>0)
		{
			valido = true;
		}
		return valido;
	}

	@Override
	public boolean existePersona(int dni) {
		return datos.existePersona(dni);
	}
	

}
