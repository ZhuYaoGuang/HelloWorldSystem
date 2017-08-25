<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
    <h1>添加学生信息</h1>
    <hr/>
    <form action="add" method="post">
    姓名:<input name="name" type="text"/><br/>
  	学号:<input name="number" type="text"/><br/>
  	数学成绩:<input name="math" type="text"/><br/>
  	英语成绩:<input name="English" type="text"/><br/>
  	语文成绩:<input name="chinese" type="text"><br/>
  	<input type="submit" value="添加"/>
    </form>
  </body>
</html>
