package com.practice.simple.mappingDemo.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity  
@Table(name="student")  
public class StudentEntity {  
  
    @Id  
    private int student_id;  
    private String student_name;  
    private int student_age;  
      
    @OneToOne(cascade={CascadeType.REMOVE})
//    @JoinColumn(name = "fk")
    private Subject sub;  
      
    public Subject getSub() {  
        return sub;  
    }  
  
    public void setSub(Subject sub) {  
        this.sub = sub;  
    }  
  
    public StudentEntity(int student_id, String student_name, int student_age , Subject sub) {  
        super();  
        this.student_id = student_id;  
        this.student_name = student_name;  
        this.student_age = student_age;  
        this.sub=sub;  
    }  
  
    public StudentEntity() {  
        super();  
    }

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}  
  
      
}   