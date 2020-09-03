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
  background-image: url("https://www.optimumsystemsonline.com/wp-content/uploads/2018/01/Ecommerce-Website.jpeg");
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
		<table align="center" height="300" width="250" body style='background: rgba(255,255,255,0.8);'>
			<th align="right">Lets's </th>
			<th align="left">Get Started</th>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username" placeholder="even nickname will do" /></td>
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
				<td></td>
				<td><form:button id="register" name="register"></form:button></td>
				<td style="text-align:center"><a href="home.jsp"><img src="https://cdn4.iconfinder.com/data/icons/mono-color-web-mobile/250/Home-512.png" style="width:30px;height:30px;"></a></td>
				<td></td>
			</tr>
		</table>
	</form:form>

</body>
</html>