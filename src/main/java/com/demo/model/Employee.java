package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column
	@Id
	private int Id;
	
	public Employee() {
		
	}
	public Employee(String firstName, String lastname, int id) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastname=" + lastname + ", Id=" + Id + "]";
	}
	
	
	
}
