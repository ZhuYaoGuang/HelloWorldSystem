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
   <center><h1>ѧ����Ϣ����ϵͳ</h1></center>
   <a href="load.jsp">��ʦ���</a>&nbsp;&nbsp;&nbsp;<a href="find.jsp">����</a>
   <hr/>
   <h2>��ӭ����<%=session.getAttribute("user")%></h2>
   <table border="1" width="80%" align="center">
   	<tr>
   		<th>���</th>
   		<th>����</th>
   		<th>ѧ��</th>
   		<th>��ѧ�ɼ�</th>
   		<th>���ĳɼ�</th>
   		<th>Ӣ��ɼ�</th>
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
   <a href="welcome.jsp">�˳�</a>
  </body>
</html>
