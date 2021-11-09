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
 * Servlet implementation class Filtrar
 */
@WebServlet("/Filtrar")
public class Filtrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Filtrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			seguroDao seguroDaos = new seguroDao();
			ArrayList<seguro> lista = new ArrayList<seguro>();
			
			tipoSeguroDao seguroDao = new tipoSeguroDao();
			ArrayList<tipoSeguro> listaTipo = new ArrayList<tipoSeguro>();
			listaTipo =	seguroDao.obtenerTipos();
			
			int id = Integer.parseInt(request.getParameter("filtro"));
			
			lista = seguroDaos.obtenerSegurosFiltrados(id);
			
			request.setAttribute("filtrado", lista);
			request.setAttribute("Tipofiltrado", listaTipo);
			request.setAttribute("id", id);
			
			RequestDispatcher rd = request.getRequestDispatcher("/Lista.jsp");   
			rd.forward(request, response);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
