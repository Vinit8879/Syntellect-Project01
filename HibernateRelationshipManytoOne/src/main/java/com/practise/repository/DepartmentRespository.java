package com.practise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.model.Department;

public interface DepartmentRespository extends JpaRepository<Department, Integer>{
     
}
