package cn.edu.hpu.stumag.service;

import java.util.List;

import cn.edu.hpu.stumag.model.Student;

public interface StudentManager {
	
	public List<Student> getStudents();
	
	public boolean add(Student stu);
	
	public boolean del(int id);
	
	public boolean update(Student stu);
	
	public Student getStudentById(int id);
}
