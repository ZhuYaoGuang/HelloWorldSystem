package cn.edu.hpu.stumag.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class HomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        String username=(String) request.getAttribute("username");
		
		StudentManager sm = new StudentManagerImpl();
		List<Student> list = sm.getStudents();
		
		request.setAttribute("username", username);
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		
	}

}
