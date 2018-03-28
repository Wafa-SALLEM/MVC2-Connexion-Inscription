<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Formulaire d'inscription</p> <br>
	<!-- action = nom de la servlet -->
	<form action="FinInscriServlet" method="POST">
		Nom:<input type ="text" name="nom"/>
		Prénom: <input type="text" name="prenom"/>
		Adresse: <input type="text" name ="adresse"/>
		<input type="reset" value="Annuler"/>
		<input type="submit" value="Inscrir"/><br>
		<p>Message: ${monMsg}</p>
	</form>
</body>
</html>