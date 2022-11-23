package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> employeeDetails() {
		return employeerepository.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		employeerepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeerepository.save(employee);
	}
	
	

	
}
