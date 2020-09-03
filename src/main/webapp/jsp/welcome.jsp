<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<style>
body, html {
  height: 100%;
  margin: 0;
}
body  {
  background-image: url("https://static1.bigstockphoto.com/0/9/1/large1500/190844629.jpg");
  background-position: center;
  background-size: cover;
}
</style> 

</head>
<body>
	<form:form id="displayform" modelAttribute="expense" action="addprocess"
		method="post">
		<table align="center" height="120" width="150" body style='background: rgba(255,255,255,0.8);'>
			
			<th><a href="hide_show"><img src="https://previews.123rf.com/images/airdone/airdone1505/airdone150500033/39565705-business-concept-image-of-a-businessman-clicking-balance-sheet-button-on-virtual-screen-over-blue-ba.jpg" style="width:85px;height:40px;"></a></th>
			<th>Expense Diary</th>
			<th></th>
			<tr>
				<td><form:label path="expcat">Expense Category</form:label></td>
				<td><form:input path="expcat" name="expcat" id="expcat" value="${grocery}"/></td>
				<td></td>

			</tr>
			<tr>
				<td><form:label path="expname">Expense name</form:label></td>
				<td><form:input path="expname" name="expname" id="expname" placeholder="Spent on what?" /></td>
				<td></td>
			</tr>
			<tr>
				<td><form:label path="expamt">Amount</form:label></td>
				<td><form:password path="expamt" name="expamt"
						id="expamt" placeholder="To be precise.." /></td>
				<td></td>
			</tr>
			<tr>
				<td style="text-align:left"><a href="home.jsp"><img src="https://cdn4.iconfinder.com/data/icons/mono-color-web-mobile/250/Home-512.png" style="width:30px;height:30px;"></a></td>
				<td style="text-align:centre"><form:button id="add" name="add"><img src="https://image.flaticon.com/icons/png/512/32/32360.png" style="width:30px;height:30px;"></form:button></td>
				<td style="text-align:left"><a href="highnote"><img src="https://png.pngitem.com/pimgs/s/78-780842_back-button-white-icon-png-transparent-png.png" style="width:50px;height:30px;"></a></td>		
			</tr>
		</table>
		<div align="center" style="color:green;">${added}</div>			
	</form:form>
	
	

</body>
</html>