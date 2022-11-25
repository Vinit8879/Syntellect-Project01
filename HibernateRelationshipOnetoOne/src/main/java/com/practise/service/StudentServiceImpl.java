package com.practise.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practise.model.Student;
import com.practise.repository.DepartmentRespository;
import com.practise.repository.StudentRespository;




@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRespository repository;
	@Autowired
	DepartmentRespository deptRespository;
	
	List<Student> studentsList=new ArrayList<Student>();
	@Override
	public void addStudent(Student student) {
		studentsList.add(student);
		repository.saveAll(studentsList);
	}

	@Override
	public List<Student> showStudents() {
		return repository.findAll();
	}

	
	@Override
	public Student updateStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public String deleteById(int id) {
		repository.deleteById(id);
		return "deleted succesfully";
	}

	
}
