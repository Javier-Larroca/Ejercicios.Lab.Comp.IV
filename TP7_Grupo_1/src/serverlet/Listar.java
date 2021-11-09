package serverlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.seguro;
import dominio.seguroDao;
import dominio.tipoSeguro;
import dominio.tipoSeguroDao;

/**
 * Servlet implementation class Listar
 */
@WebServlet("/Listar")
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Listar() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		seguroDao segurosDao = new seguroDao();
		ArrayList<seguro> listaSeguro = new ArrayList<seguro>();
		listaSeguro = segurosDao.obtenerSeguros();
		tipoSeguroDao seguroDao = new tipoSeguroDao();
		ArrayList<tipoSeguro> lista = new ArrayList<tipoSeguro>();
		lista =	seguroDao.obtenerTipos();
		request.setAttribute("listaTipos", lista);
		request.setAttribute("listaSeguro", listaSeguro);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Lista.jsp");   
		rd.forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
