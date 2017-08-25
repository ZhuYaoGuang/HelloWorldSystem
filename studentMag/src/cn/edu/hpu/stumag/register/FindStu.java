package cn.edu.hpu.stumag.register;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class FindStu extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GB18030");
			response.setCharacterEncoding("GB18030");
         String name=(String)request.getParameter("name");
         
         StudentManagerImpl smi=new StudentManagerImpl();
         
         Student stu=new Student();

         stu=smi.getStudentByName(name);
         
         if(stu.getName()!=null)
         {
        	 request.setAttribute("stu", stu);
        	 request.getRequestDispatcher("/findview.jsp").forward(request, response);
         }
         else
         {
        	 OutputStream out =response.getOutputStream(); 
         	out.write("<html>".getBytes());
         	request.setCharacterEncoding("GB18030");
 			response.setCharacterEncoding("GB18030");
 			
 			String data="<br/>抱歉，不存在此数据！<br/>";
 			
 			//用html技术中meta标签模拟了一个http响应头，来控制浏览器的行为
 			out.write("<meta http-equiv='content-type'  content='text/html;charset=GB18030'>".getBytes());
 			out.write(data.getBytes("GB18030"));
 			out.write("</html>".getBytes());
         }
	}

}
