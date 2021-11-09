package negocio;

import java.util.List;
import entidades.Persona;


public interface PersonaNegocio {
	public boolean agregar(Persona persona);
	public boolean eliminar(int dni);
	public boolean modificar(Persona persona);
	public boolean camposValidos(Persona persona);
	public boolean existePersona(int dni);
	public List<Persona> listar();	
}
