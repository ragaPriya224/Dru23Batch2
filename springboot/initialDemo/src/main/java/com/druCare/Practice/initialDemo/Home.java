package com.druCare.Practice.initialDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {

	private String owner;
	private int doorNo;
	
	@Autowired
	private InternetConnection c;
	
	Home(){
		System.out.println("I'm constructor");
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void connect() {
//		InternetConnection c = new InternetConnection(); //tight coupling
		c.switchOn();
		System.out.println("connecting to internet");
		}
	
}
