<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

String userName=request.getParameter("userName");
String passWord=request.getParameter("passWord");
String passWord2=request.getParameter("passWord2");
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/spring_register","root","123456");
String sqlQuery="select * from user where userName=?";
PreparedStatement ps=conn.prepareStatement(sqlQuery);
ps.setString(1, userName);
ResultSet rs=ps.executeQuery();
if(rs.next()){
	response.sendRedirect("registerFail.jsp");
	conn.close();
	ps.close();
	return;
}

String sql="insert into user values(null,?,?)";
PreparedStatement ps2=conn.prepareStatement(sql);
ps2.setString(1, userName);
ps2.setString(2, passWord);
int count=ps2.executeUpdate();
if(count>0){
	response.sendRedirect("registerSuccess.jsp");
	conn.close();
	ps.close();
}else{
	response.sendRedirect("registerFail.jsp");
	conn.close();
	ps.close();
}

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
