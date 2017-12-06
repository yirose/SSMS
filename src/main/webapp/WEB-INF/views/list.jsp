<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list Page</title>
</head>
<body>
	<h3>welcome:<shiro:principal/></h3>
	<shiro:hasRole name="admin">
		<h3>Admin Page</h3>
		<a href="${APP_PATH}/admin.jsp">Admin</a>
	</shiro:hasRole>
	<shiro:hasRole name="user">
		<h3>User Page</h3>
		<a href="${APP_PATH}/user.jsp">User</a>
	</shiro:hasRole>
	<h3>Iist Page</h3>
	<a href="${APP_PATH}/logout">logout</a>
</body>
</html>