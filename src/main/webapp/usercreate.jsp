<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
Enter Username For login:
<input type="text" name="username"><br/><br/>
Enter Password For login:
<input type="password" name="password"><br/><br/>
<input type="submit" name="Register" value="Create the account"><br/><br/>
</form>
<%if(request.getParameter("Register")!=null){%>
<jsp:useBean id="user" class="com.u.User" scope="request"></jsp:useBean> 
<jsp:setProperty property="*" name="user"/>
<jsp:forward page="Ucservlet"></jsp:forward>
<%}%>
</body>
</html>