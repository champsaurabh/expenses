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
  background-image: url("https://images.newscientist.com/wp-content/uploads/2019/10/15125716/gettyimages-1091936124.jpg");
  background-position: center;
  background-size: cover;
}
td, th {
  border: 1px solid black;
  text-align: left;
  padding: 8px;
}
   
</style>

</head>
<body>
	<header>
    		<h2 align="center" style="color:white;">Stoners Billboard..</h2>
    </header>
    <div style="text-align:center"><a href="home.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQHvfrtWkV8jqjq_Y7WdQWPoUNTa0FeOT69rQ&usqp=CAU" 
						style="width:33px;height:30px;"></a></div>
	<br>						
	<div style="text-align:center"><a href="hide_show"><img src="https://pngimage.net/wp-content/uploads/2018/06/view-details-button-png-1.png" 
						style="width:80px;height:30px;"></a></div>
	<br>
    <table id="tableone" align="center" height="300" width="650" style='background: rgba(255,255,255,0.7);'>
	     <thead>
		    <tr>
		      <th>username</th>
		      <th>name</th>
		      <th>birthdate</th>
		      <th>score</th> 
		      <th style="display:${obj2}">bakescore</th>
		      <th style="display:${obj2}">blazescore</th>
		      <th style="display:${obj2}">nightscore</th>
		    </tr>
	  	</thead>
	  	<tbody>
				
				<c:forEach items="${obj}" var="obj1">
			        <tr>
			          <td>${obj1.username}</td>
			          <td>${obj1.firstname}</td>
			          <td>${obj1.birthdate}</td>
			          <td>${obj1.totscore}</td>
			          <td style="display:${obj2}">${obj1.bakescore}</td>
			          <td style="display:${obj2}">${obj1.score}</td>
			          <td style="display:${obj2}">${obj1.nightscore}</td>
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