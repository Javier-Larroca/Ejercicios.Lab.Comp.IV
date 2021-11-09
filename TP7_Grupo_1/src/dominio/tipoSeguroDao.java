package dominio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class tipoSeguroDao {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "segurosgroup";


	
	public int agregarTipoSeguro(tipoSeguro tipoSeguro)
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
			String query = "Insert into tiposeguros(idTipo,descripcion) values ('"+tipoSeguro.getId()+"','"+tipoSeguro.getDescripcion()+"')";
			filas=st.executeUpdate(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return filas;
	}
	
	public ArrayList<tipoSeguro> obtenerTipos() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<tipoSeguro> lista = new ArrayList<tipoSeguro>();
		Connection conn = null;
		try{
			conn = DriverManager.getConnection(host + dbName, user, pass);
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("Select idTipo, descripcion FROM tiposeguros");
			
			while(rs.next()){
				
				tipoSeguro tipo = new tipoSeguro();
				tipo.setId(rs.getInt("idTipo"));
				tipo.setDescripcion(rs.getString("descripcion"));
				
				lista.add(tipo);
			}
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		
		}
		
		return lista;
	}

	
	public tipoSeguro obtenerUnTipo(int id)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		tipoSeguro tipo = new tipoSeguro();
		Connection con = null;
		try{
			con = DriverManager.getConnection(host + dbName, user, pass);
			PreparedStatement miSentencia = con.prepareStatement("Select * from tiposeguros where idTipo = ?");
			miSentencia.setInt(1, id); 
			ResultSet resultado = miSentencia.executeQuery();
			resultado.next();
			
			tipo.setId(resultado.getInt(1));
			tipo.setDescripcion(resultado.getString(2));

		    
		    con.close();
		}
		catch(Exception e)
		{
			System.out.println("Conexion fallida");
		}
		finally
		{
		}
		return tipo;
	}
	
}
