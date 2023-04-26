<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="productServelet">
  		<label for="lib">Libelle</label><br>
  		<input type="text" id="lib" name="lib"><br>
  		<label for="pu">PU</label><br>
  		<input type="text" id="pu" name="pu"><br>
  		<label for="desc">Description</label><br>
  		<input type="text" id="desc" name="desc"><br>
  		<label for="dateF">Date Fabrication</label><br>
  		<input type="date" id="dateF" name="dateF"><br>
  		<label for="dateEx">Date Expiration</label><br>
  		<input type="date" id="dateEx" name="dateEx"><br>
  		<input type="submit" id="Soumettre" name="Soumettre">
	</form>
</body>
</html>