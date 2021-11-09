package daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Persona;
import dao.PersonaDao;
import daoImp.Conexion;

public class PersonaDaoImp implements PersonaDao{
	
	private static final String agregar = "INSERT INTO personas(Dni, Nombre, Apellido) VALUES(?, ?, ?)";
	private static final String eliminar = "DELETE FROM personas WHERE Dni = ?";
	private static final String modificar = "UPDATE personas SET Nombre = ?, Apellido = ? WHERE DNI = ?";
	private static final String listar = "SELECT * FROM personas";
	private static final String obtenerPersona = "SELECT Dni FROM personas WHERE Dni = ?";
	
	@Override
	public boolean agregar(Persona persona) {
		
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean agregaPersona = false;
		try
		{
			statement = conexion.prepareStatement(agregar);
			statement.setInt(1, persona.getDNI());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				agregaPersona = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return agregaPersona;
	}

	@Override
	public boolean eliminar(int dni) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean eliminaPersona = false;
		
		try 
		{
			statement = conexion.prepareStatement(eliminar);
			statement.setInt(1, dni);
			if(statement.executeUpdate() > 0) {
				conexion.commit();
				eliminaPersona = true;
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			}catch(SQLException e2)
			{
				e2.printStackTrace();
			}
		}
		return eliminaPersona;
	}

	@Override
	public boolean modificar(Persona persona) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean modificaPersona = false;
		try {
			statement = conexion.prepareStatement(modificar);
			statement.setString(1, persona.getNombre());
			statement.setString(2, persona.getApellido());
			statement.setInt(3, persona.getDNI());
			
			if (statement.executeUpdate() > 0) {
				conexion.commit();
				modificaPersona = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conexion.rollback();
			}catch(SQLException e2){
				e2.printStackTrace();
			}
		}
		
		return modificaPersona;
	}

	@Override
	public List<Persona> listar() {
		PreparedStatement statement;
		ResultSet resultado;
		ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
		Connection conexion = Conexion.getConexion().getSQLConexion();
		
		try 
		{
			statement = conexion.prepareStatement(listar);
			resultado = statement.executeQuery();
			while (resultado.next()) {
				listaDePersonas.add(parsePersona(resultado));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listaDePersonas;
	}
	
	private Persona parsePersona(ResultSet resultSet) throws SQLException
	{
		int dni = resultSet.getInt("Dni");
		String nombre = resultSet.getString("Nombre");
		String apellido = resultSet.getString("Apellido");
		return new Persona(dni, nombre, apellido);
	}

	@Override
	public boolean existePersona(int dni) {
		
		PreparedStatement statement;
		ResultSet resultado;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean existe = false;
		
		try 
		{
			statement = conexion.prepareStatement(obtenerPersona);
			statement.setInt(1, dni);
			resultado = statement.executeQuery();
			
			if(resultado.next()) existe = true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return existe;
	}

}
