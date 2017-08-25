package cn.edu.hpu.stumag.android;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.hpu.stumag.register.User;
import cn.edu.hpu.stumag.register.UserManagerImpl;

public class androiddeng extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
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
                    response.getOutputStream().write("success".getBytes());
        			flag=1;
        		}
        	}
		}
        
        if(flag==0){
        	response.getOutputStream().write("fail".getBytes());
        }
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
