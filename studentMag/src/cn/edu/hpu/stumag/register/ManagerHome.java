package cn.edu.hpu.stumag.register;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;

public class ManagerHome extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		StudentManager sm = new StudentManagerImpl();
		List<Student> list = sm.getStudents();
		request.setAttribute("stulist", list);
		//��manager.jsp����WEB-INF�з�ֹ�ǹ���Ա����URLֱ�ӷ��ʹ������
		request.getRequestDispatcher("/WEB-INF/manager.jsp").forward(request, response);
	}

}
