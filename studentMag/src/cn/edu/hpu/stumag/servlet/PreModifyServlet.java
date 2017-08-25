package cn.edu.hpu.stumag.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class PreModifyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		StudentManager sm = new StudentManagerImpl();
		Student stu = sm.getStudentById(id);
		
		if(stu != null)
		{
			request.setAttribute("stu", stu);
			request.getRequestDispatcher("/modify.jsp").forward(request, response);
		}
		
	}

}
