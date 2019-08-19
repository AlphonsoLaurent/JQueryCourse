<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1 align="center">Registro de personas</h1>
	<form action="valida-login.jsp">
		Nombre:
		<input type="text" name="nombre"><br><br>
		Apellido:
		<input type="text" name="apellido"><br><br>
		Usuario:
		<input type="text" name="usuario"><br><br>
		Contraseña:
		<input type="password" name="contraseña"><br><br>		
		<input type="submit" name="enviar" value="enviar"><br><br>
		<jsp:include page="fecha.jsp"></jsp:include>
	</form>
</body>
</html>