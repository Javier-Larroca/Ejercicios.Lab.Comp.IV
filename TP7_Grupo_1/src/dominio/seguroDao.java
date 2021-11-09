package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class seguroDao {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "segurosgroup";


	
	public int agregarSeguro(seguro seguro)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
		int filas=0;
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host+dbName, user,pass);
			Statement st = cn.createStatement();
			String query = "Insert into seguros(descripcion,idTipo, costoContratacion, costoAsegurado) "
			+ "values ('"+seguro.getDescripcion()+"','"+seguro.getTipo().getId()+"','"+seguro.getCostoContratación()+"','"+seguro.getCostoAsegurado()+"')";
			filas=st.executeUpdate(query);
			cn.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}
	
	public ArrayList<seguro> obtenerSeguros() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<seguro> lista = new ArrayList<seguro>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("Select S.idSeguro, S.descripcion, T.idTipo, T.descripcion, S.costoAsegurado, S.costoContratacion from seguros S inner join tiposeguros T on S.idTipo = T.idTipo");
			
			while(rs.next()){
				
				seguro seguro = new seguro();
				seguro.setId(rs.getInt("S.idSeguro"));
				seguro.setDescripcion(rs.getString("S.descripcion"));
				seguro.getTipo().setId(rs.getInt("T.idTipo"));
				seguro.getTipo().setDescripcion(rs.getString("T.descripcion"));
				seguro.setCostoAsegurado(rs.getBigDecimal("S.costoAsegurado"));
				seguro.setCostoContratación(rs.getBigDecimal("S.costoContratacion"));

				
				lista.add(seguro);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}
	
	public ArrayList<seguro> obtenerSegurosFiltrados(int id) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<seguro> lista = new ArrayList<seguro>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(
					"Select S.idSeguro, S.descripcion, T.idTipo, T.descripcion, S.costoAsegurado, S.costoContratacion "
					+ "from seguros S inner join tiposeguros T on S.idTipo = T.idTipo "
					+ "where S.idTipo ="+id);
			
			while(rs.next()){
				
				seguro seguro = new seguro();
				seguro.setId(rs.getInt("S.idSeguro"));
				seguro.setDescripcion(rs.getString("S.descripcion"));
				seguro.getTipo().setId(rs.getInt("T.idTipo"));
				seguro.getTipo().setDescripcion(rs.getString("T.descripcion"));
				seguro.setCostoAsegurado(rs.getBigDecimal("S.costoAsegurado"));
				seguro.setCostoContratación(rs.getBigDecimal("S.costoContratacion"));

				
				lista.add(seguro);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}

	
	public seguro obtenerUnSeguro(int id)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		seguro seguro = new seguro();
		Connection con = null;
		try{
			con = DriverManager.getConnection(host + dbName, user, pass);
			PreparedStatement miSentencia = con.prepareStatement("Select S.idSeguro, S.descripcion, T.idTipo, T.descripcion, S.costoAsegurado, S.costoContratacion from seguros S inner join tiposeguros T on S.idTipo = T.idTipo where S.idSeguro = ?");
			miSentencia.setInt(1, id); 
			ResultSet resultado = miSentencia.executeQuery();
			resultado.next();
			
			seguro.setId(resultado.getInt(1));
			seguro.setDescripcion(resultado.getString(2));
			seguro.getTipo().setId(resultado.getInt(3));
			seguro.getTipo().setDescripcion(resultado.getString(4));
			seguro.setCostoAsegurado(resultado.getBigDecimal(5));
			seguro.setCostoContratación(resultado.getBigDecimal(6));

		    
		    con.close();
		}
		catch(Exception e)
		{
			System.out.println("Conexion fallida");
		}
		finally
		{
		}
		return seguro;
	}

}
