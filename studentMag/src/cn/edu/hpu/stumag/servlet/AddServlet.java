package cn.edu.hpu.stumag.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("GB18030");
		response.setCharacterEncoding("GB18030");
		
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		int math = Integer.parseInt(request.getParameter("math"));
		int English = Integer.parseInt(request.getParameter("English"));
		int chinese = Integer.parseInt(request.getParameter("chinese"));
		
		StudentManager sm = new StudentManagerImpl();
		Student stu = new Student();
		stu.setName(name);
		stu.setNumber(number);
		stu.setMath(math);
		stu.setEnglish(English);
		stu.setChinese(chinese);
		boolean flag = sm.add(stu);
		
		if(flag == true)
		{
			request.getRequestDispatcher("/ManagerHome").forward(request, response);
		}	
	}
}
