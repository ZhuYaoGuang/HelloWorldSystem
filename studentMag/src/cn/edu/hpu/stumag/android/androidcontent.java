package cn.edu.hpu.stumag.android;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManagerImpl;


public class androidcontent extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		StudentManagerImpl smi=new StudentManagerImpl();
		List<Student> students=smi.getStudents();
		
		//�õ��������
        String format=request.getParameter("format");
        //�������json��������������Ծ���ͻ��˷���json��ʽ�����ݣ�����ͷ���XML��ʽ������
        if("json".equals(format)){
			StringBuilder builder=new StringBuilder();
	 	   builder.append('[');
	 	   for(Student pers:students){
	 		   builder.append('{');
	 		   builder.append("name:\"").append(pers.getName()).append("\",");
	 		   builder.append("number:").append(pers.getNumber()).append(',');
	 		   builder.append("chinese:").append(pers.getChinese()).append(',');
	 		   builder.append("math:").append(pers.getMath()).append(',');
	 		   builder.append("english:").append(pers.getEnglish());
	 		   builder.append("},");
	 	   }
	 	   builder.deleteCharAt(builder.length()-1);
	 	   builder.append(']');
	 	   request.setAttribute("json", builder.toString());
	 	   request.getRequestDispatcher("/WEB-INF/Page/jsonstudents.jsp").forward(request, response);
        }
        
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
