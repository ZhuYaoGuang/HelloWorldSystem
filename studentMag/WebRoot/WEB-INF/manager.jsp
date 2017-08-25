<%@ page language="java" import="java.util.*,cn.edu.hpu.stumag.model.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'manager.jsp' starting page</title>
    
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
    <center><h1>教师管理界面</h1></center>
   <a href="add.jsp">添加学生</a>&nbsp;&nbsp;<a href="index.jsp">返回主页</a>
   <hr/>
   <table border="1" width="80%" align="center">
   	<tr>
   		<th>序号</th>
   		<th>姓名</th>
   		<th>学号</th>
   		<th>数学成绩</th>
   		<th>语文成绩</th>
   		<th>英语成绩</th>
   		<th>操作</th>
   	</tr>
   	<%
	List<Student> list = (List<Student>)request.getAttribute("stulist");
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
   		<td>
   		<a href="del?id=<%=stu.getId() %>">删除</a>
   		<a href="preModify?id=<%=stu.getId() %>">修改</a>
   		</td>
   	</tr>
   <%
   		}
   }
   %>
   </table>
  </body>
</html>
