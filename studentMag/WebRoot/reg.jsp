<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'reg.jsp' starting page</title>

  </head>
  
  <body>
    <form action="AddUser" method="post">
          �˺�<input type="text" name="userid"><br/>   
          ����<input type="password" name="password"><br/>  
          �����ظ�<input type="password" name="password2"><br/>  
          �û���<input type="text" name="username"><br/>  
          <input type="submit" value="ȷ��">
    </form>
  </body>
</html>
