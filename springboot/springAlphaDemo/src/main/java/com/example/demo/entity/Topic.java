package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Subject")
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
//	@Column(name = "tname",unique= true,length =10)
	private String name;
	private int subTopic;
	
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
	
}
