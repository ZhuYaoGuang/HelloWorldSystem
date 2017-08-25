<%@ page language="java" import="java.util.*,cn.edu.hpu.stumag.model.*,cn.edu.hpu.stumag.service.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
   <center><h1>学生信息管理系统</h1></center>
   <a href="load.jsp">教师入口</a>&nbsp;&nbsp;&nbsp;<a href="find.jsp">查找</a>
   <hr/>
   <h2>欢迎您！<%=session.getAttribute("user")%></h2>
   <table border="1" width="80%" align="center">
   	<tr>
   		<th>序号</th>
   		<th>姓名</th>
   		<th>学号</th>
   		<th>数学成绩</th>
   		<th>语文成绩</th>
   		<th>英语成绩</th>
   	</tr>
   	<%
   	StudentManager sm = new StudentManagerImpl();
	List<Student> list = sm.getStudents();
   	if(list != null)
   	{
   		for(int i=0; i<list.size(); i++)
   		{
   			Student stu = list.get(i);
   		
   	%>
   	<tr>
   		<td><%=stu.getId() %></td>
   		<td><%=stu.getName() %></td>
   		<td><%=stu.getNumber() %></td>
   		<td><%=stu.getMath() %></td>
   		<td><%=stu.getEnglish() %></td>
   		<td><%=stu.getChinese() %></td>
   	</tr>
   <%
   		}
   }
   %>
   </table>
   <a href="welcome.jsp">退出</a>
  </body>
</html>
