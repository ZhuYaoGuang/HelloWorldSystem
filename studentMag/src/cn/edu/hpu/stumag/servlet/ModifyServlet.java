package cn.edu.hpu.stumag.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class ModifyServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("GB18030");
		response.setCharacterEncoding("GB18030");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		int math = Integer.parseInt(request.getParameter("math"));
		int English = Integer.parseInt(request.getParameter("english"));
		int chinese = Integer.parseInt(request.getParameter("chinese"));
		
		StudentManager sm = new StudentManagerImpl();
		Student stu = new Student();
		stu.setId(id);
		stu.setName(name);
		stu.setNumber(number);
		stu.setMath(math);
		stu.setEnglish(English);
		stu.setChinese(chinese);
		boolean flag = sm.update(stu);
		
		
		if(flag == true)
		{
			response.sendRedirect("ManagerHome");
		}
	}

}
