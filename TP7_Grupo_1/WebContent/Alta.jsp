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

	<%

	ArrayList<tipoSeguro> lista = new ArrayList<tipoSeguro>();
	ArrayList<seguro> listaSeguro = new ArrayList<seguro>();
	if(request.getAttribute("listaTipos")!=null)
		lista = (ArrayList<tipoSeguro>)request.getAttribute("listaTipos");	
		listaSeguro = (ArrayList<seguro>)request.getAttribute("listaSeguro");	

	%>

	<a href="Inicio.jsp">Inicio</a>
	<a href="cargarAgregar">Agregar Seguro</a>
	<a href="Listar">Listar Seguros</a>
	
	<h1>Agregar Seguros</h1>
	
	<form action="agregar" method="post">
		<label>IdSeguro</label> <label> <%= listaSeguro.size() + 1 %> </label> <br> <br>
		<label>Descripción</label> <input type="text" name="descripcion"/> <br> <br>
		<label>Tipo de Seguro</label> <select name="tipo"> 
		<% for(tipoSeguro tipo: lista) { 
		%>
		<option value="<%=tipo.getId()%>"><%= tipo.getDescripcion()%></option> 
		<% } %>
		</select> <br> <br>
		<label>Costo Contratación</label> <input type="text" name="contratacion"/> <br> <br>
		<label>Costo Máximo Asegurado</label> <input type="text" name="costoMaximo"/> <br> <br>
		<input type="submit" name="btnAgregar" />
	</form>
	


	
</body>
</html>