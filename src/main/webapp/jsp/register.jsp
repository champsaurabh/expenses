<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
body, html {
  height: 100%;
  margin: 0;
}
body  {
  background-image: url("https://images.newscientist.com/wp-content/uploads/2019/10/15125716/gettyimages-1091936124.jpg");
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
#register {
  background-image: url("https://www.swanhillsauctions.com/wp-content/uploads/2017/10/register-button-2.png");
  width: 118px; height: 28px; background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
   
}
</style>

</head>
<body>
	<form:form id="regForm" modelAttribute="user" action="registerProcess"
		method="post">
        <header>
    		<h2 align="center" style="color:white;">Lets's Get Started..</h2>
    	</header>
		<table align="center" height="300" width="250" body style='background: rgba(255,255,255,0.4);'>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username" placeholder="expecting some savage" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" placeholder="something won't forget" /></td>
			</tr>
			<tr>
				<td><form:label path="firstname">FirstName</form:label></td>
				<td><form:input path="firstname" name="firstname"
						id="firstname" placeholder="Just a Formality uk"/></td>
			</tr>
			<tr>
				<td><form:label path="lastname">LastName</form:label></td>
				<td><form:input path="lastname" name="lastname" id="lastname" placeholder="I'm sure its WOW" /></td>
			</tr>
			<tr>
				<td><form:label path="birthdate">Birthdate</form:label></td>
				<td><form:input path="birthdate" name="birthdate" id="birthdate" placeholder="when is next party?"/></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="register" name="register"></form:button></td>
				<td style="text-align:center"><a href="home.jsp"><img src="https://cdn4.iconfinder.com/data/icons/mono-color-web-mobile/250/Home-512.png" style="width:30px;height:30px;"></a></td>
				<td></td>
			</tr>
		</table>
	</form:form>

</body>
</html>