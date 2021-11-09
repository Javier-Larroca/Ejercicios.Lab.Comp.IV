<%@page import="java.util.ArrayList"%>
<%@page import="dominio.tipoSeguro"%>
<%@page import="dominio.seguro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="Inicio.jsp">Inicio</a>
<a href="cargarAgregar">Agregar Seguro</a>
<a href="Listar">Listar Seguros</a>

<%

		ArrayList<tipoSeguro> lista = new ArrayList<tipoSeguro>();
		ArrayList<seguro> listaSeguro = new ArrayList<seguro>();
		int id = 0;
		if(request.getAttribute("listaTipos")!=null){
			lista = (ArrayList<tipoSeguro>)request.getAttribute("listaTipos");	
			listaSeguro = (ArrayList<seguro>)request.getAttribute("listaSeguro");		
		}else{
			if(request.getAttribute("filtrado")!=null){	
				listaSeguro = (ArrayList<seguro>)request.getAttribute("filtrado");
				lista = (ArrayList<tipoSeguro>)request.getAttribute("Tipofiltrado");
				id = Integer.parseInt(request.getAttribute("id").toString());
			}
		}

%>

<h1>"Tipos de seguros de la base de datos"</h1>
<br> <br>

<form action="Filtrar" method="get">
<label> Búsqueda por tipo de Seguros </label>
<select name="filtro">
<% for(tipoSeguro tipo: lista) { 
		if(id == tipo.getId() && request.getAttribute("id") != null){ %>
		<option value="<%=tipo.getId()%>" selected="selected"><%= tipo.getDescripcion()%></option> 
		<% } else{%>
		
			<option value="<%=tipo.getId()%>" ><%= tipo.getDescripcion()%></option>
		<%} }%>
		</select> 
<input type="submit" name="btnFiltrar" value="Filtrar"/>
</form>
<br><br>
<table border="1">
	<tr>
		<th>ID Seguro</th>
		<th>Descripción Seguro</th>
		<th>Descripción Tipo Seguro</th>
		<th>Costo Contratación</th>
		<th>Costo Máximo Asegurado</th>
	</tr>
	

	
	<% for(seguro item: listaSeguro){ %>
	
	<tr>
		<td> <%=item.getId() %> </td>
		<td> <%=item.getDescripcion() %> </td>
		<td> <%=item.getTipo().getDescripcion() %> </td>
		<td> <%=item.getCostoContratación() %> </td>
		<td> <%=item.getCostoAsegurado() %> </td>
	</tr>
	
	<% } %>

</table>

</body>
</html>