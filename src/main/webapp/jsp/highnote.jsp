<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>highnote</title>
<style>
body, html {
  height: 100%;
  margin: 0;
}
body  {
  background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSsUA2DHldgaDeoIvwmfSwILMAQAOB5TbF3EQ&usqp=CAU");
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
 #1{
    position: absolute;
 	padding: 14px 16px 12px 16px;
	margin-top: 10px;
 }
 .offer-text{
    position: absolute;
 	padding: 14px 16px 12px 16px;
	margin-top: 20px;
 }
 .offer-text1{
    position: absolute;
 	padding: 14px 16px 12px 16px;
	
 }
 .offer-text2{
    position: absolute;
 	padding: 14px 16px 12px 16px;
	margin-top: 10px;
 }
</style>
</head>
<body>
	<!---<form:form id="displayform" modelAttribute="display" action="displayprocess"
		method="post">--->
		<!-- <div class="offer-text" style="align:right"style="color:white;">Welcome ${firstname}
					<br>click on score to check your expenses
					<br></div>
					<div class="offer-text1"><a href="hide_show"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR_Y-T7H1HmgqxNI2pDlp9k6g5jvXHLoF_8FA&usqp=CAU" 
						style="width:33px;height:30px;"></a></div>
						<div class="offer-text2"style="color:white;">click either of the three options,
					`<br> to record your expense</div> -->
		<table align="center">
				 <th style="color:white;">
					Welcome ${firstname}
					<br>click below to check your expenses
					<br>
					</th>
					<tr>
					<td align="center"><a href="hide_show"><img src="https://icon-library.com/images/expenses-icon/expenses-icon-28.jpg" 
						style="width:55px;height:35px;"></a></td>
						</tr>
						<tr>
						<td  style="color:white;">click either of the three options,
					to record <br>your expense<br></td>
				</tr>
				<table align="center">
				    <th style="color:white;">Grocery</th>
					<th></th>
					<th style="color:white;">Online Shopping</th>
					<th></th>
					<th style="color:white;">Other Expenses</th>
					<tr  style="text-align:right ">
						<td><a href="add"><img src="https://previews.123rf.com/images/svetlam87/svetlam871711/svetlam87171100998/90773712-grocery-in-a-shopping-cart-and-shopping-basket-vector-illustration-flat-design-.jpg" 
						style="width:90px;height:90px;"></a></td>
						<td></td>				
						<td><a href="add1"><img src="https://wordstream-files-prod.s3.amazonaws.com/s3fs-public/styles/simple_image/public/images/media/images/google-shopping-feed-ecommerce-final.jpg?s62EBQOnC4qV09Acw1HbgMps0o9l4Q0D&itok=yderrDik" 
						style="width:90px;height:90px;"></a></td>
						<td></td>	
						<td><a href="add2"><img src="https://is1-ssl.mzstatic.com/image/thumb/Purple118/v4/ec/65/27/ec652773-e771-3c3b-802c-5b440621a96e/AppIcon-85-220-4-2x.png/1080x800bb.jpg" 
						style="width:90px;height:90px;"></a></td>
					</tr>
					<tr>
						<td style="color:white;" align="right">${grocery}</td>
						<td></td>
						<td style="color:white;" align="right">${online_shopping}</td>
						<td></td>
						<td style="color:white;"align="right">${other_expenses}</td>
					</tr>
				</table>					
		</table>
	<!--- </form:form>	--->	
</body>
</html>