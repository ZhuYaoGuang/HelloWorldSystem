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
    ������Ҫ��ѯ��ѧ��������:<br/>
    <input type="text" name="name"><br/>
    <input type="submit" value="ȷ��">
    </form>
    <a href="index.jsp">����</a>
  </body>
</html>
