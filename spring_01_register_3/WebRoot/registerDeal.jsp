<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%>
<%@ page import="com.ldu.register.model.User" %>
<%@ page import="com.ldu.register.service.UserManagerImpl" %>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

String userName=request.getParameter("userName");
String passWord=request.getParameter("passWord");
String passWord2=request.getParameter("passWord2");
User u=new User();
u.setUserName(userName);
u.setPassWord(passWord);

UserManagerImpl um=new UserManagerImpl();
boolean exist=um.exists(u);
if(exist){
	response.sendRedirect("registerFail.jsp");
	return;
}

boolean addjudge=um.add(u);
if(addjudge){
	response.sendRedirect("registerSuccess.jsp");
	return;
}
response.sendRedirect("registerFail.jsp");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'registerDeal.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
