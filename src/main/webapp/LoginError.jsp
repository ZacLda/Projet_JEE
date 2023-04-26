<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Error</title>
	<style>
  		form {
		  border-style: solid;
		  border-color: red;
		}
	</style>
</head>
<body>
	<form method="POST" action="loginServelet">
		<label for="log" >Login</label><br>
  		<input type="text" name="log"><br>
  		<label for="log">Password</label><br>
  		<input type="password" id="pass" name="pass"><br>
  		<input type="submit" value="Connection">
	</form>
</body>
</html>