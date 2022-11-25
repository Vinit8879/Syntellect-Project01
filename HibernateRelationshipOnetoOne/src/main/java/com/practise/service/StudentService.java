package com.practise.service;

import java.util.List;
import com.practise.model.Student;


public interface StudentService {

	//Create
	public void addStudent(Student student);
	
	//GET
	public List<Student> showStudents();
	
	
	
	
	//Update
	public Student updateStudent(Student student);
	
	//Delete
	public String deleteById(int id);
	
}
