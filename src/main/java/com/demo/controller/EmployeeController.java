package com.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee Emp){
		return employeeService.saveEmployee(Emp);
		
	}
	@GetMapping(path="/all")
	public List<Employee> galldetails() {
		return employeeService.employeeDetails();
	}
	
	@DeleteMapping("/delete/{id}")
	public void removeEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
	}
	
}
