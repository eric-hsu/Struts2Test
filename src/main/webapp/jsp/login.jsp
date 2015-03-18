<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录信息页面</title>
</head>
<body>
	用户名：<%=request.getParameter("username") %> 
	密码：<%=request.getParameter("password") %>
</body>
</html>