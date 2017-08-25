package cn.edu.hpu.stumag.register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.util.DBOperator;

public class UserManagerImpl implements UserManager {

	public boolean add(User user) {
        boolean flag = false;
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "insert into users values(?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getUserid());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getName());
			
			int rows = pst.executeUpdate();
			if(rows > 0)
			{
				flag = true;
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			
		}finally
		{
			DBOperator.close(pst, conn);
			
		}	
		return flag;
	}

	public User getUserById(String id) {
		
		User user = new User();
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "select * from users where id="+id;
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next())
			{
				user.setUserid(rs.getString("userid"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			
		}finally
		{
			DBOperator.close(rs, st, conn);
			
		}
		
		return user;
	}

	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "select * from users";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next())
			{
				User user = new User();
				user.setUserid(rs.getString("userid"));
				user.setPassword(rs.getString("password"));	
				user.setName(rs.getString("name"));
				list.add(user);
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			
		}finally
		{
			DBOperator.close(rs, st, conn);
			
		}
		
		
		return list;
	}

}
