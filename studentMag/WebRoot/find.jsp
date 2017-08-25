<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'find.jsp' starting page</title>

  </head>
  
  <body>
  <form action="FindStu" method="post">
    请输入要查询的学生的姓名:<br/>
    <input type="text" name="name"><br/>
    <input type="submit" value="确定">
    </form>
    <a href="index.jsp">返回</a>
  </body>
</html>
