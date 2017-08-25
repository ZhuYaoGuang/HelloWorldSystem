package cn.edu.hpu.stumag.register;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class ManagerPage extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         
		String id=(String)request.getParameter("adminid");
		String pa=(String)request.getParameter("adminpa");
		
		if(id.equals("admin")&&pa.equals("hpuacm123")){
			StudentManager sm = new StudentManagerImpl();
			List<Student> list = sm.getStudents();
			request.setAttribute("stulist", list);
			//把manager.jsp放在WEB-INF中防止非管理员利用URL直接访问管理界面
			request.getRequestDispatcher("/WEB-INF/manager.jsp").forward(request, response);
		}
		else
		{
			OutputStream out =response.getOutputStream(); 
        	out.write("<html>".getBytes());
        	request.setCharacterEncoding("GB18030");
			response.setCharacterEncoding("GB18030");
			
			String data="<br/>账号或密码错误，请重新输入！<br/>";
			
			//用html技术中meta标签模拟了一个http响应头，来控制浏览器的行为
			out.write("<meta http-equiv='content-type'  content='text/html;charset=GB18030'>".getBytes());
			out.write(data.getBytes("GB18030"));
			out.write("</html>".getBytes());
		}
		
	}

}
