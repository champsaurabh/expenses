<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
   <div id="1"><img src="https://i.pinimg.com/236x/1f/72/91/1f7291ea15f8fe612221d10e6dc58844--funny-family-family-guy.jpg" 
				style="width:250px;height:300px;"></div>
	<div id="2"><img src="https://cdn.ebaumsworld.com/mediaFiles/picture/2183782/85636483.jpg" 
				style="width:250px;height:300px;"></div>
				
	<button onclick="myFunction()">Try it</button>
</body>
<script> 
  
        
var x1 = document.getElementById("2");
x1.style.display = "none";
function myFunction() {
	  var x = document.getElementById("1");
	  var x1 = document.getElementById("2");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } else {
	    x.style.display = "none";
	  }
	  x1.style.display = "none";
	}
   
    </script> 
  
</html>