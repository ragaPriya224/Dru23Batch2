package com.practice.simple.mappingDemo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity  
@Table(name="subject")  
public class Subject {  
	@Id  
	private int sub_id; 
	private String sub_name;  
	private int sub_marks;  
	// for bidirectional one to one mapping
	@OneToOne(mappedBy = "sub",cascade={CascadeType.REMOVE})
	private StudentEntity studentEntity;

	public Subject(String sub_name, int sub_marks, int sub_id,StudentEntity studentEntity) {  
		super();  
		this.sub_name = sub_name;  
		this.sub_marks = sub_marks;  
		this.sub_id=sub_id; 
		this.studentEntity = studentEntity;
	}  

	public Subject()  
	{  
		super();  
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public int getSub_marks() {
		return sub_marks;
	}

	public void setSub_marks(int sub_marks) {
		this.sub_marks = sub_marks;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}  


}  