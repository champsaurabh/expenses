<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
body, html {
  height: 100%;
  margin: 0;
}
body  {
  background-image: url("https://images.newscientist.com/wp-content/uploads/2019/10/15125716/gettyimages-1091936124.jpg");
  background-position: center;
  background-size: cover;
   
}
#login {
  background-image: url("https://www.freeiconspng.com/uploads/login-button-png-4.jpg");
  width: 110px; height: 28px; background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
   
}
</style>
</head>
<body>

	<form:form id="loginForm" modelAttribute="login" action="loginProcess"
		method="post">
		<header>
    		<h2 align="center" style="color:white;">Enroute Nirvana</h2>
    	</header>
		<table align="center" height="50" width="25" body style='background: rgba(255,255,255,0.4);'>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><form:label path="username">Username: </form:label></td>
				<td><form:input path="username" name="username" id="username" placeholder="Homies call you what?" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" placeholder="ping admin if forgot"/></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
			    <td></td>	
				<td align="centre"><form:button id="login" name="login"></form:button></td>
				<td style="text-align:center"><a href="home.jsp"><img src="https://cdn4.iconfinder.com/data/icons/mono-color-web-mobile/250/Home-512.png" 
				style="width:33px;height:30px;"></a></td>
			</tr>

			<tr></tr>
			<tr>
			</tr>
		</table>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>
</html>