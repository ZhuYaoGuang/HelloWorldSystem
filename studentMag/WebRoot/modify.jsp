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
     <h1>�޸�ѧ����Ϣ</h1>
     <%
     Student stu = (Student)request.getAttribute("stu");
     %>
    <hr/>
    <form action="modify" method="post">  
    <input name="id" type="text" value="<%=stu.getId() %>" style="display: none"/>
    ����:<input name="name" type="text" value="<%=stu.getName() %>"/><br/>
  	ѧ��:<input name="number" type="text" value="<%=stu.getNumber() %>"/><br/>
  	���ĳɼ�:<input name="chinese" type="text" value="<%=stu.getChinese() %>"/><br/>
  	��ѧ�ɼ�:<input name="math" type="text" value="<%=stu.getMath() %>"/><br/>
  	Ӣ��ɼ�:<input name="english" type="text" value="<%=stu.getEnglish() %>"/><br/>
  	<input type="submit" value="�޸�"/>
    </form>
  </body>
</html>
