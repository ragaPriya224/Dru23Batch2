package com.example.demo;

public class Topic {

	private String id;
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
