<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Вход</title>
</head>
<body>
<h1>Это страница входа</h1>
<form action="Controller" method="get" target="_blank">
		<input type="hidden" name="command" value="forward"/> 
		Enter login:<br /> 
		<input type="text" name="login" value=""/><br />
		Enter password:<br />
		 <input type="password" name="password" value=""/><br />
		<input type="submit" value="Отправить"> <br />
		

	</form>


</body>
</html>