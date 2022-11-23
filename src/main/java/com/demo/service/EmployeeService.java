package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> employeeDetails();
	
	public void deleteEmployee(int id);
	
	public Employee updateEmployee(Employee employee);
}
