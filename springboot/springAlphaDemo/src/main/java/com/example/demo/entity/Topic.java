package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="Subject")
public class Topic {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
//	@Column(name = "tname",unique= true,length =10)
	private String name;
	
	private int subTopic;
	
    @OneToMany(mappedBy="topic" ,cascade = CascadeType.REMOVE)
	private List<Course> course;
	
	public Topic() {
	}
	public Topic(String id, String name, int subTopic) {
		this.id = id;
		this.name = name;
		this.subTopic = subTopic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(int subTopic) {
		this.subTopic = subTopic;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", subTopic=" + subTopic + ", course=" + course + "]";
	}
	
}
