<%@ page language="java" import="java.util.*,cn.edu.hpu.stumag.model.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modify.jsp' starting page</title>
    
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
     <h1>修改学生信息</h1>
     <%
     Student stu = (Student)request.getAttribute("stu");
     %>
    <hr/>
    <form action="modify" method="post">  
    <input name="id" type="text" value="<%=stu.getId() %>" style="display: none"/>
    姓名:<input name="name" type="text" value="<%=stu.getName() %>"/><br/>
  	学号:<input name="number" type="text" value="<%=stu.getNumber() %>"/><br/>
  	语文成绩:<input name="chinese" type="text" value="<%=stu.getChinese() %>"/><br/>
  	数学成绩:<input name="math" type="text" value="<%=stu.getMath() %>"/><br/>
  	英语成绩:<input name="english" type="text" value="<%=stu.getEnglish() %>"/><br/>
  	<input type="submit" value="修改"/>
    </form>
  </body>
</html>
