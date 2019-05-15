<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN</title>
</head>
<body>

<form method="post" action="../login">
	<table>
		<tr>
		<td style="text-align:center" >
		<h1>Accedi</h1> 
		</td>
		</tr>
		<tr>
		<td>UserName</td>
		<td><input type="text" name="user"></td>
		</tr>
		<tr> 
		<td>Password</td>
		<td><input type="text" name="password"></td>		
		</tr>
		<tr>
		<td> 
		<input type="submit" value="INVIA"/>
		<input type="reset" VALUE="ANNULLA"/>	
		</td>
		</tr>	
	</table>
</form>	
</body>
</html>