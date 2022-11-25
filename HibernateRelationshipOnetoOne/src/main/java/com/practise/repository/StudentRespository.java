package com.practise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.model.Student;


@Repository
public interface StudentRespository extends JpaRepository<Student, Integer>{

	

}
