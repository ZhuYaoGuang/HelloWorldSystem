package cn.edu.hpu.stumag.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class DelServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		StudentManager sm = new StudentManagerImpl();
		boolean flag = sm.del(id);
		if(flag == true)
		{
			response.sendRedirect("ManagerHome");
		}
		
	}

}
