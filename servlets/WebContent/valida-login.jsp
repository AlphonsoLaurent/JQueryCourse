<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenido</title>
</head>
<body>
	<h1 align="center">Bienvenido</h1>
	Gracias por enviarnos tus datos, los cuales son: <br><br>
	
	Nombre: <%=request.getParameter("nombre") %> <br>
	Apellido <%=request.getParameter("apellido") %> <br>
	Usuario: <%=request.getParameter("usuario") %> <br>
	Contraseña: <%=request.getParameter("contraseña") %> <br><br>
	<jsp:include page="fecha.jsp"></jsp:include>
	
</body>
</html>