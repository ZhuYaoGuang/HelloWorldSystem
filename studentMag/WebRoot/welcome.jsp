<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'welcome.jsp' starting page</title>
    <style type="text/css">  
    #con{
      padding-top:150px;
      padding-left:150px;
      padding-right:150px;
      padding-bottom:150px;
      background-color: #7A67EE;
      width: 150px;
      height: 150px;
      margin: 0 auto;
    }
    </style>
  </head>
  
  <body>
     <div id="con">
     <form action="Wel" method="post">
     <center><font size="3px"><b>学生信息管理系统</b><font/></center><br/>
     <font size="2px">账号</font> <input type="text" name="userid"><br/>
     <font size="2px">密码</font> <input type="password" name="password">
     <input type="submit" value="登录"><a href="reg.jsp">
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#FFFFFF">注册</font></a>
     </form>
     </div>
  </body>
</html>
