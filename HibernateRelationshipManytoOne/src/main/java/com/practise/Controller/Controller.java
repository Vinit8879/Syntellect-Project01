package com.practise.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.model.Student;
import com.practise.service.StudentService;

@RestController
@RequestMapping("/student")
public class Controller {

	@Autowired
	private StudentService service;
	

	@PostMapping("/add")
	public Student createStudent(@RequestBody Student student) {
		
		return service.addStudent(student);
	}

	@GetMapping("/all")
	public List<Student> displayStudents() {
		
		return service.showStudents();

	}


	@PutMapping("/update")
	public Student updatesStudent(@RequestBody Student student) {
		
		return service.updateStudent(student);

	}
	@DeleteMapping("/delete/{id}")
	public String deletesById(@PathVariable("id") int id) {
		
		return service.deleteById(id);

	}
}
