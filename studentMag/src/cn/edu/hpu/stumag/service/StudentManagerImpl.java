package cn.edu.hpu.stumag.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.util.DBOperator;

public class StudentManagerImpl implements StudentManager {

	public boolean add(Student stu) {
		
		boolean flag = false;
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "insert into _student(name,number,math,english,chinese) values(?,?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, stu.getName());
			pst.setString(2, stu.getNumber());
			pst.setInt(3, stu.getMath());
			pst.setInt(4, stu.getEnglish());
			pst.setInt(5, stu.getChinese());
			
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

	public boolean del(int id) {
		boolean flag = false;
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "delete from _student where id=?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1,id);
			
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

	public List<Student> getStudents() {
		List<Student> list = new ArrayList<Student>();
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "select * from _student";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next())
			{
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setNumber(rs.getString("number"));
				stu.setMath(rs.getInt("math"));
				stu.setEnglish(rs.getInt("english"));
				stu.setChinese(rs.getInt("chinese"));
				
				list.add(stu);
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

	public boolean update(Student stu) {
		
		boolean flag = false;
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "update _student set name=?,number=?,math=?,English=?,chinese=? where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, stu.getName());
			pst.setString(2, stu.getNumber());
			pst.setInt(3, stu.getMath());
			pst.setInt(4, stu.getEnglish());
			pst.setInt(5, stu.getChinese());
			pst.setInt(6, stu.getId());
			
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

	public Student getStudentById(int id) {
		Student stu = new Student();
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try
		{
			conn = DBOperator.getConnection();
			String sql = "select * from _student where id="+id;
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next())
			{
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setNumber(rs.getString("number"));
				stu.setMath(rs.getInt("math"));
				stu.setEnglish(rs.getInt("english"));
				stu.setChinese(rs.getInt("chinese"));
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			
		}finally
		{
			DBOperator.close(rs, st, conn);
			
		}
		
		return stu;
	}
	
	public Student getStudentByName(String name) {
		Student stu = new Student();
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try
		{
			conn = DBOperator.getConnection();
			//sql中如果 name是整型的倒不会出现什么错误，而如果sql中字符串类型必须要包含在引号内。
			String sql = "select * from _student where name='"+name+"'";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next())
			{
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setNumber(rs.getString("number"));
				stu.setMath(rs.getInt("math"));
				stu.setEnglish(rs.getInt("english"));
				stu.setChinese(rs.getInt("chinese"));
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			
		}finally
		{
			DBOperator.close(rs, st, conn);
		}
		
		return stu;
	}

}
