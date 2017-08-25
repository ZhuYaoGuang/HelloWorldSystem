package cn.edu.hpu.stumag.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperator {
	
	// ����MySQL�����ݿ���������
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
	//����mysql�����ݿ����ӵ�ַ��
	public static final String DBDURL = "jdbc:mysql://localhost:3306/hpu_stu" ;
	//mysql���ݿ�������û���
	public static final String DBUSER = "root" ;
	//mysql���ݿ����������
	public static final String DBPASS = "1234" ;
	
	static
	{
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("1111111111");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DBDURL,DBUSER,DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("22222222222222");
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(ResultSet rs, Statement st, Connection conn)
	{
		try
		{
			if(rs != null)
			{
				rs.close();
			}
			if(st != null)
			{
				st.close();
			}
			if(conn != null)
			{
				conn.close();
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	public static void close(Statement st, Connection conn)
	{
		close(null,st,conn);
	}
	

}
