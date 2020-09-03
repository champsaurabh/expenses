<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table</title>
<style>
body, html {
  height: 100%;
  margin: 0;
}
body  {
  background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSsUA2DHldgaDeoIvwmfSwILMAQAOB5TbF3EQ&usqp=CAU");
  background-position: center;
  background-size: cover;
}
td, th {
  border: 1px solid black;
  text-align: left;
  padding: 8px;
}


   
</style>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#date" ).datepicker({ dateFormat: 'yy-mm-dd'});
  } );
  </script>

</head>
<body>
	<header>
    		<h2 align="center" style="color:white;">Expenses !</h2>
    </header>
    
    <form:form id="filterform" modelAttribute="filter" action="select_year"
		method="post">
    <div style="text-align:center">
    <a href="show_all" align="left" style="margin-right:390px;"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQL213J5ubXz57XbGpVxcgcHF5hZYd29b-IBQ&usqp=CAU" 
						style="width:130px;height:40px;"></a>
    <a href="home.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQHvfrtWkV8jqjq_Y7WdQWPoUNTa0FeOT69rQ&usqp=CAU" 
						style="width:33px;height:30px;"></a></div>
	<div align="center">
	<div align="center" style="color:red;">${nr}</div>
	
	<form:label path="date" style="color:white;">Date:</form:label>
  	<form:input path="date" id="date" value="${date}"/>
	
	<label for="year" style="color:white;">Choose a year:</label>
	<select name="expyear" id="expyear">
		<option value="${year}">${year}</option>
	    <option value="2020">2020</option>
	    <option value="2019">2019</option>
	    <option value="2018">2018</option>
	    <option value="2017">2017</option>
	    <option value="2016">2016</option>
	</select>
	
	<label for="month" style="color:white;">Choose a month:</label>
	<select name="expmonth" id="expmonth">
		<option value="${monthno}">${month}</option>
	    <option value="1">jan</option>
	    <option value="2">feb</option>
	    <option value="3">mar</option>
	    <option value="4">april</option>
	    <option value="5">may</option>
	    <option value="6">june</option>
	    <option value="7">july</option>
	    <option value="8">aug</option>
	    <option value="9">sept</option>
	    <option value="10">oct</option>
	    <option value="12">nov</option>
	    <option value="11">dec</option>
	    
	    
	</select>
	<td style="text-align:centre"><form:button id="year" name="year"><img src="https://www.cmcu.org/wp-content/uploads/2018/11/apply-button-01.png" style="width:80px;height:30px;"></form:button></td>
	
  	</div>
  	
  	</form:form>
						
	<br>						
    <table id="tableone" align="center" height="300" width="650" style='background: rgba(255,255,255,0.7);'>
	     <thead>
		    <tr>
		      <th>expense category</th>
		      <th>expense name</th>
		      <th>expense amount</th>
		      <th>date</th>
		      <th>time</th>
		    </tr>
	  	</thead>
	  	<tbody>
				
				<c:forEach items="${obj}" var="obj1">
			        <tr>
			          <td>${obj1.expcat}</td>
			          <td>${obj1.expname}</td>
			          <td>${obj1.expamt}</td>
			          <td>${obj1.date}</td>
			          <td>${obj1.time}</td>
			        </tr>
      			</c:forEach>
				<!-- -<tr>
					<td style="text-align:center"><a href="home.jsp"><img src="https://cdn4.iconfinder.com/data/icons/mono-color-web-mobile/250/Home-512.png" 
						style="width:33px;height:30px;"></a></td>
				</tr>  -->
		</tbody>
	</table>
	
</body>


</html>