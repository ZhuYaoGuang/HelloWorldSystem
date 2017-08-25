package cn.edu.hpu.stumag.register;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelUser extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
        String userid=request.getParameter("userid");
        String password=request.getParameter("password");
        
        UserManagerImpl umi=new UserManagerImpl();
        
        List<User> list = new ArrayList<User>();
        
        list=umi.getUsers();
        
        int flag=0;
        for (int i = 0; i < list.size(); i++) {
			User user=list.get(i);

        	if(user.getUserid().equals(userid)){
        		if(user.getPassword().equals(password)){
        			//���������������ʾ�û�������session��¼
        			HttpSession session = request.getSession();
        			session.setAttribute("user",user.getName()); 
        			request.getRequestDispatcher("/index.jsp").forward(request, response);
        			flag=1;
        		}
        	}
		}
        
        if(flag==0){
        	
        	OutputStream out =response.getOutputStream(); 
        	out.write("<html>".getBytes());
        	request.setCharacterEncoding("GB18030");
			response.setCharacterEncoding("GB18030");
			
			String data="<br/>�˺Ż�����������������룡<br/>";
			
			//��html������meta��ǩģ����һ��http��Ӧͷ�����������������Ϊ
			out.write("<meta http-equiv='content-type'  content='text/html;charset=GB18030'>".getBytes());
			out.write(data.getBytes("GB18030"));
			out.write("</html>".getBytes());
        }
		
	}

}
