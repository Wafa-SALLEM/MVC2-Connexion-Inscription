<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="InscriptionServlet" method="POST" name="formInscri">
	<span class="login">Bonjour ${monUser['login']} ${monUser['pwd']}</span> <br>
	<a href="fin.jsp">Quitter</a>
	<input type="submit" value="Inscription">
</form>
	
</body>
</html>