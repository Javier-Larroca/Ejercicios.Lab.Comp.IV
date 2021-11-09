package serverlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DecimalDV;

import dominio.seguro;
import dominio.seguroDao;

/**
 * Servlet implementation class agregar
 */
@WebServlet("/agregar")
public class agregar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public agregar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("btnAgregar") != null) {
			seguro nuevo = new seguro();
			seguroDao segDao = new seguroDao();
			nuevo.setDescripcion(request.getParameter("descripcion"));
			nuevo.getTipo().setId(Integer.parseInt(request.getParameter("tipo")));
			nuevo.setCostoAsegurado(new BigDecimal(request.getParameter("costoMaximo")));
			nuevo.setCostoContratación(new BigDecimal(request.getParameter("contratacion")));
			segDao.agregarSeguro(nuevo);
			
			
		}
		RequestDispatcher rd = request.getRequestDispatcher("/Alta.jsp");   
        rd.forward(request, response);
		
	}

}
