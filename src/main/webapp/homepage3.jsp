<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Edit and Search</title>
</head>
<body>
<form>
Company of the Shoe:<br/>
<select name="company">
<option value="select">company</option>
<option value="woodland">woodland</option>
<option value="nike">nike</option>
</select><br/><br/>
Type of Shoe:<br/>
<select name="kinds">
<option value="select">kinds</option>
<option value="sneaker">sneaker</option>
<option value="boots">boots</option>
</select><br/><br/>
Size of The Shoe:<br/>
<select name="sizes">
<option value="select">sizes</option>
<option value="1">1</option>
<option value="2">2</option>
</select><br/><br/>
Price of the Shoe: <br/>
<input type="text" name="prices">
<br/><br/>
<input type="submit" name="Register" value="Register Details"><br/><br/>
</form>
<%if(request.getParameter("Register")!=null){%>
<jsp:useBean id="user" class="com.controller.Shoe" scope="request"></jsp:useBean> 
<jsp:setProperty property="*" name="user"/>
<jsp:forward page="Viewinfo"></jsp:forward>
<%}%>
</body>
</html>