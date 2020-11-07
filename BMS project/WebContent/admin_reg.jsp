<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    

<!DOCTYPE html>

<head>
<meta charset="ISO-8859-1">
<title> Admin Registration Form</title>
</head>
<body>
	<spr:form action="prep_admin_reg.htm" method="post" commandName="admin" >
	<table align="center" >
		<tr>
			<td>
				Name:
			</td>
			<td>
				<spr:input path="name"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Mobile:
			</td>
			<td>
				<spr:input path="mobile"/>
			</td>
		</tr>
		<tr>
			<td>
				Email:
			</td>
			<td>
				<spr:input path="email"/>
			</td>
		</tr>
		<tr>
			<td>
				Password:
			</td>
			<td>
				<spr:password path="password"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index2.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>

