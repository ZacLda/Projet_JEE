<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire Utilisateur</title>
</head>
<body>
	<h1> FORMULAIRE UTILISATEUR </h1>
	<form method="POST" action="userServelet">
  		<label for="pren">Prenom</label><br>
  		<input type="text" id="pren" name="pren"><br>
  		<label for="nom">Nom</label><br>
  		<input type="text" id="nom" name="nom"><br>
  		<label for="log">Login</label><br>
  		<input type="text" id="log" name="log"><br>
  		<label for="pass">Password</label><br>
  		<input type="password" id="pass" name="pass"><br>
  		<input type="submit" id="Soumettre" name="Soumettre">
	</form>
</body>
</html>