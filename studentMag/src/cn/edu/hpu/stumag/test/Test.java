package cn.edu.hpu.stumag.test;

import java.sql.Connection;
import java.util.List;

import cn.edu.hpu.stumag.model.Student;
import cn.edu.hpu.stumag.service.StudentManager;
import cn.edu.hpu.stumag.service.StudentManagerImpl;
import cn.edu.hpu.stumag.util.DBOperator;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Connection conn = DBOperator.getConnection();
		if(conn != null)
		{
			System.out.println("Connection Success.");
		}
		
		
		/*StudentManager sm = new StudentManagerImpl();
		List<Student> list = sm.getStudents();
		for(Student stu : list)
		{
			System.out.println(stu.getId());
			System.out.println(stu.getName());
		}*/
		
	}

}
