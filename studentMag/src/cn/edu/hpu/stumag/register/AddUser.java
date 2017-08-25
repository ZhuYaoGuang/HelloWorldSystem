package cn.edu.hpu.stumag.register;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUser extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GB18030");
		response.setCharacterEncoding("GB18030");
         String userid=request.getParameter("userid");
         String password=request.getParameter("password");
         String password2=request.getParameter("password2");
         String username=request.getParameter("username");
         if(!password.equals(password2)){
        	 OutputStream out =response.getOutputStream(); 
          	out.write("<html>".getBytes());
          	request.setCharacterEncoding("GB18030");
  			response.setCharacterEncoding("GB18030");
  			
  			String data="<br/>输入的两次密码不一致，请重新输入！<br/>";
  			
  			//用html技术中meta标签模拟了一个http响应头，来控制浏览器的行为
  			out.write("<meta http-equiv='content-type'  content='text/html;charset=GB18030'>".getBytes());
  			out.write(data.getBytes("GB18030"));
  			out.write("</html>".getBytes());
         }
         else
         {
        	 User user=new User();
             
             user.setUserid(userid);
             user.setPassword(password);
             user.setName(username);
             
             UserManagerImpl umi=new UserManagerImpl();
             boolean flag=umi.add(user);
             
             if(flag==true){
            	 response.sendRedirect("welcome.jsp");
             }
         }
	}

}
