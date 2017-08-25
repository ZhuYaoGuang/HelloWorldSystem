<%@ page language="java" import="java.util.*,cn.edu.hpu.stumag.model.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
    Student stu=(Student)request.getAttribute("stu");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'findview.jsp' starting page</title>

  </head>
  
  <body>
  <a href="find.jsp">返回</a>
     <table border="1" width="80%" align="center">
   	<tr>
   		<th>序号</th>
   		<th>姓名</th>
   		<th>学号</th>
   		<th>数学成绩</th>
   		<th>语文成绩</th>
   		<th>英语成绩</th>
   	</tr>
   	<tr>
   		<td><%=stu.getId() %></td>
   		<td><%=stu.getName() %></td>
   		<td><%=stu.getNumber() %></td>
   		<td><%=stu.getMath() %></td>
   		<td><%=stu.getEnglish() %></td>
   		<td><%=stu.getChinese() %></td>
   	</tr>
   </table>
  </body>
</html>
