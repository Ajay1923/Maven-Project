package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Home { 
    public Home() {
    	System.out.println("Two Way");
    } 
	private String owner;
	private int doorNo;
	
	@Autowired
	private InternetCables router;
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
		router.switchOn();
		System.out.println("Connecting electricity");
	}
}
   