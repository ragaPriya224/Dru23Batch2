package com.practice.simple.mappingDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.simple.mappingDemo.repository.StudentRepository;
import com.practice.simple.mappingDemo.repository.SubjectRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private SubjectRepository subjectRepository;

	
	@DeleteMapping("/stu")
	public void delEmp() {
		studentRepository.deleteById(1L);
	}

	@DeleteMapping("/sub")
	public void delSub() {
		subjectRepository.deleteById(44L);
	}
}